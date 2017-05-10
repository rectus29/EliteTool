package com.rectusCorp.EliteTool.events.type;

import com.rectusCorp.EliteTool.events.TypeProcessor;
import com.rectusCorp.EliteTool.events.processor.EventTypeProcessor;

/**
 * Created by a.bernard on 27/04/2017.
 */
public interface EventType {

	public String getType();

	public EventTypeProcessor getTypeProcessors();

}
