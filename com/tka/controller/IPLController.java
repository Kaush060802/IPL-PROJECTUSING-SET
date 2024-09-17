package com.tka.controller;

import java.util.Set;

import com.tka.entity.IPLPlayer;
import com.tka.service.IPLPlayerService;

public class IPLController {
	IPLPlayerService service;
	public Set<IPLPlayer>getAllPlayersController(){
		//System.out.println(" IPLControlle->getAllPlayersControllerr");
		service= new IPLPlayerService();
		Set<IPLPlayer> db= service.getAllPlayerService();
		return db;


	}
	public Set<IPLPlayer> getAllPlayerswithSameTeamController(String team) {
		service= new IPLPlayerService();
		Set<IPLPlayer> db1= service.getAllPlayerwithSameTeamService(team);
		return db1;
	}
	public Set<IPLPlayer> getAllPlayerswithsametRunController(int run) {
		service= new IPLPlayerService();
		Set<IPLPlayer> db2= service.getAllPlayerswithsametRunService(run );
		return db2;
	}
	public Set<IPLPlayer> getAllPlayerswitHighestRunController() {
		service= new IPLPlayerService();
		Set<IPLPlayer> HighestRunScorer= service.getAllPlayerswitHighestRunService( );
		return  HighestRunScorer;
	}
	public Set<IPLPlayer> getAllPlayerswitLowestRunController() {
		service.getAllPlayerService();
		Set<IPLPlayer> LowestRunScorer= service.getAllPlayerswithLowestRunService( );
		return LowestRunScorer;
	}
	public Set<IPLPlayer> getAllPlayerswitHighestWicketTakerController() {
		service.getAllPlayerService();
		Set<IPLPlayer>HighestWicketTaker= service.getAllPlayerswitHighestWicketTakerService();
		return HighestWicketTaker;
	}


}



