package com.rectusCorp.EliteTool.view.logpanel;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class LogPanel{

	public LogPanel() throws Exception{

		try {
			// Load person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(LogPanel.class.getResource("LogPanel.fxml"));
			AnchorPane personOverview = (AnchorPane) loader.load();
			// Set person overview into the center of root layout.
			rootLayout.setCenter(personOverview);




		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
