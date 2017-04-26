package com.rectusCorp.EliteTool.entities;

import com.rectusCorp.EliteTool.enums.StationType;

public class Station extends GenericEntity{

	private String name;
	private StationType stationType = StationType.CORIOLIS;
	private Faction faction;

	public String getName() {
		return name;
	}

	public Station setName(String name) {
		this.name = name;
		return this;
	}

	public StationType getStationType() {
		return stationType;
	}

	public Station setStationType(StationType stationType) {
		this.stationType = stationType;
		return this;
	}

	public Faction getFaction() {
		return faction;
	}

	public Station setFaction(Faction faction) {
		this.faction = faction;
		return this;
	}
}
