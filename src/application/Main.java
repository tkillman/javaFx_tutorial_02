package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


//Stage > Scene > Container > node

public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			
			
			StackPane pane = new StackPane();
			Scene scene = new Scene(pane,800,500);
			stage.setScene(scene);
			
			stage.setTitle("javafx ¹è¿ìÀÚ");
			stage.setResizable(false);
			stage.show();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
