

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) throws Exception{
		this.primaryStage = primaryStage;
        primaryStage.setTitle("Hello World");
		Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

		primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    private void Test(){
		System.out.println("");
	}


    public static void main(String[] args) {
        launch(args);
    }
}
