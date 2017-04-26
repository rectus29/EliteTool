package com.rectusCorp.EliteTool.entities;

import java.util.ArrayList;
import java.util.List;

public class Ship extends GenericEntity{

	private String name;
	private String manufacturer;
	private Boolean fighterEligeable = false;
	private List<Slot> slots= new ArrayList<>();
}
