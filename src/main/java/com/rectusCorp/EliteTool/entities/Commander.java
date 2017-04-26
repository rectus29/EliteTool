package com.rectusCorp.EliteTool.entities;

import java.util.ArrayList;
import java.util.List;

public class Commander extends GenericEntity{

	private String name;
	private String identifier;
	private List<Ranking> rankingList = new ArrayList<>();

	public String getName() {
		return name;
	}

	public Commander setName(String name) {
		this.name = name;
		return this;
	}

	public String getIdentifier() {
		return identifier;
	}

	public Commander setIdentifier(String identifier) {
		this.identifier = identifier;
		return this;
	}
}
