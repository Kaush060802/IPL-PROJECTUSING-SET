package com.tka.entity;

import java.util.Set;

public class IPLPlayer {
	private  int jersyno;
	private    String name ;
	private  int run;
	private  int wicket;
	private  String team;
	public IPLPlayer() {
		super();
	}
	
	public IPLPlayer(int jersyno, String name, int run, int wicket, String team) {
		super();
		this.jersyno = jersyno;
		this.name = name;
		this.run = run;
		this.wicket = wicket;
		this.team = team;
	}

	public int getJersyno() {
		return jersyno;
	}
	public String getName() {
		return name;
	}
	public int getRun() {
		return run;
	}
	public int getWicket() {
		return wicket;
	}
	public String getTeam() {
		return team;
	}
	public void setJersyno(int jersyno) {
		this.jersyno = jersyno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRun(int run) {
		this.run = run;
	}
	public void setWicket(int wicket) {
		this.wicket = wicket;
	}
	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "IPLPlayer [jersyno = " + jersyno + ", name = " + name + ", run = " + run + ", wicket = " + wicket + ", team = "
				+ team + "]";
	}

	
	
	

}
