package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFx extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Button ba = new Button("a");
		Button bb = new Button("B");
		Button bc = new Button("C");

		VBox box = new VBox();
		box.setAlignment(Pos.CENTER);
		box.setSpacing(15);
		box.getChildren().add(ba);
		box.getChildren().add(bb);
		box.getChildren().add(bc);

		Scene cena = new Scene(box, 200, 400);

		primaryStage.setScene(cena);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
