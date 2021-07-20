package ui;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmload = new FXMLLoader(getClass().getResource("BasePane.fxml"));
		FurrierController fc=new FurrierController(primaryStage);
		fxmload.setController(fc);
		primaryStage.setResizable(false);
		Parent root=fxmload.load();
		primaryStage.setTitle("PELETERÍA DAVID");
		Scene scene = new Scene(root,1009,686);
		primaryStage.setScene(scene);
		primaryStage.show();
		fc.initialize();
		fc.loadMenuScreen();
		
	}
}
