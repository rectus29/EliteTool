/******************************************************************************
 * Copyright (c) 2000-2017 E-DEAL
 *
 * E-DEAL
 * 41 Rue Périer
 * 92120 Montrouge
 * France
 *
 * T: +33 (0)1 73 03 29 80
 * F: +33 (0)1 73 01 69 77
 * http://www.e-deal.com
 *
 * La diffusion de ce code source sous quelque forme que ce soit sans
 * l'autorisation de E-DEAL est interdite.
 *
 * Vous êtes autorisé à modifier ce code source uniquement pour votre usage
 * propre et sous réserve que les mentions de copyright demeurent intactes.
 *
 * Ce code est fourni en l'état. Aucune garantie d'aucune sorte, explicite ou
 * implicite n'est donnée. En aucun cas E-DEAL ne pourra être tenu pour
 * responsable des dommages pouvant résulter de l'utilisation de ce code
 * source.
 ******************************************************************************/
package enums;

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
