package com.rectusCorp.EliteTool.entities;

import com.rectusCorp.EliteTool.enums.EventType;

public abstract class Event extends GenericEntity {

	private String date;
	private EventType eventType = EventType.UNKNOW;
	private String eventString;

}
