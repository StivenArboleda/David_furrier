package ui;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

<<<<<<< HEAD
public class Main extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmload = new FXMLLoader(getClass().getResource("BasePane.fxml"));
		FurrierController fc=new FurrierController(primaryStage);
		fxmload.setController(fc);
		Parent root=fxmload.load();
		Scene scene = new Scene(root,1009,686);
		primaryStage.setScene(scene);
		primaryStage.show();
		fc.initialize();
		fc.loadMenuScreen();
	}
=======
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
		Parent root = FXMLLoader.load(getClass().getResource(""));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("PELETERÍA DAVID");
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	

>>>>>>> c1ebcf1b30ab5f25fb8263e8d3bd5cd22f8b6bc7
}
