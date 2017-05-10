package com.rectusCorp.EliteTool.entities;

import com.rectusCorp.EliteTool.enums.StationType;

public class StarSystem extends GenericEntity{

	private String name;
	private Position StarPosition;

	public String getName() {
		return name;
	}

	public StarSystem setName(String name) {
		this.name = name;
		return this;
	}

	public Position getStarPosition() {
		return StarPosition;
	}

	public StarSystem setStarPosition(Position starPosition) {
		StarPosition = starPosition;
		return this;
	}
}
