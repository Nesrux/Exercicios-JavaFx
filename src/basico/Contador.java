package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {
	private int contador = 0;

	@Override
	public void start(Stage primaryStage) throws Exception {

		Label titulo = new Label("Contador");
		titulo.getStyleClass().add("titulo");

		Label numero = new Label("0");
		numero.getStyleClass().add("numero");

		Button botaoIncremento = new Button("+");
		botaoIncremento.setOnAction(e -> {
			contador++;
			numero.setText(Integer.toString(contador));
		});
		botaoIncremento.getStyleClass().add("botoes");

		Button botaoDecremento = new Button("-");
		botaoDecremento.setOnAction(e -> {
			contador--;
			numero.setText(Integer.toString(contador));
		});
		botaoDecremento.getStyleClass().add("botoes");

		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(10);
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);

		VBox boxconteudo = new VBox();
		boxconteudo.getStyleClass().add("conteudo");
		boxconteudo.setSpacing(10);
		boxconteudo.setAlignment(Pos.CENTER);
		boxconteudo.getChildren().add(titulo);
		boxconteudo.getChildren().add(numero);
		boxconteudo.getChildren().add(boxBotoes);

		// TODO usar esse caminho no arquvo do campo minado para usar a
		// imagens
		String caminhoCss = getClass().getResource("/basico/contador.css").toExternalForm();
		Scene cenaPrincipal = new Scene(boxconteudo, 400, 400);
		cenaPrincipal.getStylesheets().add(caminhoCss);
		cenaPrincipal.getStylesheets().add(
				"https://fonts.googleapis.com/css2?family=Roboto+Mono:wght@100&family=Roboto:wght@100&display=swap");

		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
