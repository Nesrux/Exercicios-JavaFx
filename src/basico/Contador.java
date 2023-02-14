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
		Label numero = new Label("0");

		Button botaoIncremento = new Button("+");
		botaoIncremento.setOnAction(e -> {
			contador++;
			numero.setText(Integer.toString(contador));
		});

		Button botaoDecremento = new Button("-");
		botaoDecremento.setOnAction(e -> {
			contador--;
			numero.setText(Integer.toString(contador));
		});

		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(10);
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);

		VBox boxp = new VBox();
		boxp.setSpacing(10);
		boxp.setAlignment(Pos.CENTER);
		boxp.getChildren().add(titulo);
		boxp.getChildren().add(numero);
		boxp.getChildren().add(boxBotoes);

		String caminhoCss = getClass().getResource("/basico/contador.css").toExternalForm();
		Scene cenaPrincipal = new Scene(boxp, 400, 400);
		cenaPrincipal.getStylesheets().add(caminhoCss);

		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
