
package com.rectusCorp.EliteTool.entities;

import java.util.Date;

public class GenericEntity{

	private String id;
	private Date creationDate = new Date();
	private Date updateDate = new Date();

	public String getId() {
		return id;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

}
