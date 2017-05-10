package com.rectusCorp.EliteTool.events.processor.impl;

import com.rectusCorp.EliteTool.events.ProcessingReport;
import com.rectusCorp.EliteTool.events.processor.EventTypeProcessor;

/**
 * Created by a.bernard on 09/05/2017.
 */
public class LoadGameEventTypeProcessor implements EventTypeProcessor{

	@Override
	public ProcessingReport process(String lineToProcess) {

		return new ProcessingReport();
	}
}
