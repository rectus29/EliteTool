package com.rectusCorp.EliteTool.events.type.impl;

import com.rectusCorp.EliteTool.events.processor.EventTypeProcessor;
import com.rectusCorp.EliteTool.events.processor.impl.LoadGameEventTypeProcessor;
import com.rectusCorp.EliteTool.events.type.EventType;

/**
 * Created by a.bernard on 09/05/2017.
 */
public class LoadGameEventType implements EventType{

	public LoadGameEventType() {
	}

	@Override
	public String getType() {
		return "LoadGame";
	}

	@Override
	public EventTypeProcessor getTypeProcessors() {
		return new LoadGameEventTypeProcessor();
	}
}
