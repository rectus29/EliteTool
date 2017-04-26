package com.rectusCorp.EliteTool.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main extends Application {

	private static final Logger log = LogManager.getLogger(Main.class);
	private Stage primaryStage;
	private BorderPane rootLayout;
	private String logPath="";

    @Override
    public void start(Stage primaryStage) throws Exception{
		this.primaryStage = primaryStage;
        primaryStage.setTitle("Hello World");

		FXMLLoader loader = new FXMLLoader();
		Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
		rootLayout = (BorderPane) loader.load();

		primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    private void Test(){
		System.out.println("");
	}






}
