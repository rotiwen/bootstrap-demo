package com.rotiwen.model;

import java.util.List;

public class Area {
	private String id;
	private String code;
	private String displayName;
	private List<Table> tables;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public List<Table> getTables() {
		return tables;
	}
	public void setTables(List<Table> tables) {
		this.tables = tables;
	}
	public int getUsed() {
		int result = 0;
		
		for (Table table : this.tables) {
			if (table.getStatus() == 1) result++;
		}
		return result;
	}
}
