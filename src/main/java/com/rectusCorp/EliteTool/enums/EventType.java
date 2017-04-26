
package com.rectusCorp.EliteTool.enums;

public enum EventType{

	UNKNOW("unknow"),
	LOADGAME("LoadGame"),
	RANK("Rank"),
	PROGRESS("Progress"),
	LOCATION("Location"),
	FSDJUMP("FSDJump"),
	SUPERCRUISEEXIT("SupercruiseExit"),
	REFUELALL("RefuelAll"),
	SELLEXPLORATIONDATA("SellExplorationData"),
	MODULEBUY("ModuleBuy"),
	MODULESELL("ModuleSell"),
	MARKETBUY("MarketBuy"),
	MARKETSELL("MarketSell"),
	MISSIONACCEPTED("MissionAccepted"),
	DOCKED("Docked"),
	UNDOCKED("Undocked"),
	FUELSCOOP("FuelScoop");

	private String value;

	EventType(String value) {
		this.value = value;
	}
}
