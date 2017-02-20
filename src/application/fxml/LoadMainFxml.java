package application.fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class LoadMainFxml extends Application {

	// @Override
	// public void start(Stage primaryStage) {
	// primaryStage.setTitle("FXDB");
	//
	// try {
	// FXMLLoader loader = new
	// FXMLLoader(getClass().getResource("../resource/FXDB.fxml"));
	// AnchorPane page = (AnchorPane) loader.load();
	// Scene scene = new Scene(page);
	// primaryStage.setScene(scene);
	// primaryStage.show();
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// }
	//
	// public static void main(String[] args) {
	// launch(args);
	// }

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/resource/FXDB.fxml"));

		Scene scene = new Scene(root, Color.TRANSPARENT);
		stage.initStyle(StageStyle.UNDECORATED); //close window border
//		stage.setTitle("FXML Welcome");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
