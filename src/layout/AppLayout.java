package layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLayout extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent raiz = null;
		raiz = new TesteAncorPane();
		raiz = new TesteBorderPane();
		raiz = new TesteFlowPane();
		raiz = new TesteGridPane();

		Scene principal = new Scene(raiz, 800, 600);
		primaryStage.setScene(principal);
		primaryStage.setTitle("Testando Layout");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
