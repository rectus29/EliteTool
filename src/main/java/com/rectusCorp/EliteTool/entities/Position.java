package com.rectusCorp.EliteTool.entities;

/**
 * Created by a.bernard on 10/05/2017.
 */
public class Position extends GenericEntity{

	private Float xPos = 0f;
	private Float yPos = 0f;
	private Float zPos = 0f;

	public Position(Float xPos, Float yPos, Float zPos) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.zPos = zPos;
	}

	public Float getxPos() {
		return xPos;
	}

	public Position setxPos(Float xPos) {
		this.xPos = xPos;
		return this;
	}

	public Float getyPos() {
		return yPos;
	}

	public Position setyPos(Float yPos) {
		this.yPos = yPos;
		return this;
	}

	public Float getzPos() {
		return zPos;
	}

	public Position setzPos(Float zPos) {
		this.zPos = zPos;
		return this;
	}
}
