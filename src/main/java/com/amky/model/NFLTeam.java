package com.amky.model;

public class NFLTeam {
	
	private int id;
	private String teamName;
	private String location;
	private String qtrBack;
	
	public NFLTeam(int id, String teamName, String location, String qtrBack) {
		super();
		this.id = id;
		this.teamName = teamName;
		this.location = location;
		this.qtrBack = qtrBack;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getQtrBack() {
		return qtrBack;
	}
	public void setQtrBack(String qtrBack) {
		this.qtrBack = qtrBack;
	}

}
