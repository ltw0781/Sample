package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	
	private static Scene scene;
	
	@Override
	public void start(Stage stage) {
		try {
			scene = new Scene( loadFXML("A"));
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Parent loadFXML(String fxml) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
		return fxmlLoader.load();
	}
	
	// 현재 Scene 의 fxml(레이아웃) 재지정하기 : 화면이동
		static void setRoot(String fxml) throws IOException {
			scene.setRoot(loadFXML(fxml));
		}
		
		static void setRoot(Parent root) throws IOException{
			scene.setRoot(root);
		}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
