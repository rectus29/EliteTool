package com.rectusCorp.EliteTool.tailer;

import com.rectusCorp.EliteTool.ElitetoolApplication;
import org.apache.commons.io.input.Tailer;
import org.apache.commons.io.input.TailerListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by a.bernard on 26/04/2017.
 */
public class EliteToolTailerListener implements TailerListener{

	private static final Logger log = LogManager.getLogger(EliteToolTailerListener.class);

	public EliteToolTailerListener() {
	}

	@Override
	public void init(Tailer tailer) {
		log.debug("init tailer");
	}

	@Override
	public void fileNotFound() {
		log.debug("file not found");

	}

	@Override
	public void fileRotated() {
		log.debug("filerotated");
	}

	@Override
	public void handle(String s) {
		log.debug("handle");
		//ElitetoolApplication;
	}

	@Override
	public void handle(Exception e) {
		log.debug("handle exception", e);
	}
}
