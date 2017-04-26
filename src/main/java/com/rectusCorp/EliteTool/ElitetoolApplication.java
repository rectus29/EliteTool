package com.rectusCorp.EliteTool;

import com.rectusCorp.EliteTool.entities.Commander;
import com.rectusCorp.EliteTool.tailer.EliteToolTailerListener;
import org.apache.commons.io.input.Tailer;

import java.io.File;

public class ElitetoolApplication{

	private Commander currentCommander;
	private Tailer logTailer;

	private ElitetoolApplication() {
	}

	private static class SingletonHolder{
		private final static ElitetoolApplication instance = new ElitetoolApplication();
	}

	public static ElitetoolApplication getInstance() {
		return SingletonHolder.instance;
	}

	private void init(){
		//TODO need to variabilse log file path find a place to put that
		this.logTailer = Tailer.create(new File(""), new EliteToolTailerListener());
	}


	private void tailerRun(){
		if(this.logTailer != null)
			logTailer.run();
	}

	private void tailerStop(){
		if(this.logTailer != null)
			logTailer.stop();
	}
}
