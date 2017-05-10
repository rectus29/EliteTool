package com.rectusCorp.EliteTool.events.processor;

import com.rectusCorp.EliteTool.events.ProcessingReport;

/**
 * Created by a.bernard on 27/04/2017.
 */
public interface EventTypeProcessor{

	public ProcessingReport process(String lineToProcess);

}
