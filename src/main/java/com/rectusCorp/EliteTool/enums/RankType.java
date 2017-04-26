package com.rectusCorp.EliteTool.enums;

public enum RankType{
	COMBAT("Combat"),
	TRADE("Trade"),
	EXPLORE("Explore"),
	EMPIRE("Empire"),
	FEDEREATION("Empire"),
	CQC("CQC"),


	;

	private String name;

	RankType(String name) {
		this.name = name;
	}
}
