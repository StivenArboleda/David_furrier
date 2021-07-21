package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmload = new FXMLLoader(getClass().getResource("BasePane.fxml"));
		FurrierController fb=new FurrierController(primaryStage);
		fxmload.setController(fb);
		Parent root=fxmload.load();
		Scene scene = new Scene(root,676,530);
		primaryStage.setScene(scene);
		primaryStage.show();
		fb.loadMenuScreen();
	}

}
