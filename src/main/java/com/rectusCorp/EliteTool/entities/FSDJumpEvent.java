package com.rectusCorp.EliteTool.entities;

/**
 * Created by a.bernard on 10/05/2017.
 */
public class FSDJumpEvent extends Event{

	public static String FSDJUMP = "FSDJump";

	private StarSystem starSystem;
	private Position position;

	public FSDJumpEvent(String inputString) {
	}

	public StarSystem getStarSystem() {
		return starSystem;
	}

	public FSDJumpEvent setStarSystem(StarSystem starSystem) {
		this.starSystem = starSystem;
		return this;
	}

	public Position getPosition() {
		return position;
	}

	public FSDJumpEvent setPosition(Position position) {
		this.position = position;
		return this;
	}

	@Override
	public String getEventString() {
		return FSDJUMP;
	}
}
