package com.tka.service;
import java.util.HashSet;
import java.util.Set;

import com.tka.dao.IPLPlayerDao;
import com.tka.entity.IPLPlayer;

public class IPLPlayerService {
	IPLPlayerDao  dao;
	public Set<IPLPlayer> getAllPlayerService(){
		//System.out.println("IPLPlayerService->getAllPlayerService ");
		Set<IPLPlayer>db =new HashSet<IPLPlayer>();
		dao =new IPLPlayerDao();
		db = dao.getAllPlayers();
		return db;

	}
	public Set<IPLPlayer> getAllPlayerwithSameTeamService(String team) {
		Set<IPLPlayer>db =new HashSet<IPLPlayer>();
		dao =new IPLPlayerDao();
		db = dao.getAllPlayers();

		Set<IPLPlayer> db1 =new HashSet<IPLPlayer>();
		for (IPLPlayer iplPlayer : db) {
			if( iplPlayer.getTeam() == team) {
				db1.add(iplPlayer);
				//				break;
			}
		}

		return db1;

}
public Set<IPLPlayer> getAllPlayerswithsametRunService(int run) {
	// TODO Auto-generated method stub
	Set<IPLPlayer>db =new HashSet<IPLPlayer>();
	dao =new IPLPlayerDao();
	db = dao.getAllPlayers();

	Set<IPLPlayer> db2 =new HashSet<IPLPlayer>();
	for (IPLPlayer iplPlayer : db) {
		if( iplPlayer.getRun() ==run) {
			db2.add(iplPlayer);
			//				break;
		}
	}

	return db2;
	
}
/// HIGHEST RUN SCORER IN THE DATABASE
public Set<IPLPlayer> getAllPlayerswitHighestRunService() {
	Set<IPLPlayer>db =new HashSet<IPLPlayer>();
	dao =new IPLPlayerDao();
	db = dao.getAllPlayers();
	IPLPlayer highestRunScorer = null;
	for (IPLPlayer iplPlayer :db) {

		if( highestRunScorer ==null || iplPlayer.getRun()>highestRunScorer.getRun()){
			highestRunScorer=iplPlayer;
		}
	}
	Set<IPLPlayer> highestScorer = new HashSet<>();
	if (highestRunScorer != null) {
		highestScorer.add(highestRunScorer); 
	}
	
	return highestScorer;
	
}
//LOWEST RUN SCORER IN THE DATA BASE
public Set<IPLPlayer> getAllPlayerswithLowestRunService() {
	Set<IPLPlayer>db =new HashSet<IPLPlayer>();
	dao =new IPLPlayerDao();
	db = dao.getAllPlayers();
	IPLPlayer lowestRunScorer=null;
	for (IPLPlayer iplPlayer :db) {
		
 		if(lowestRunScorer == null || iplPlayer.getRun()<lowestRunScorer.getRun()) {
			lowestRunScorer=iplPlayer;
		}
	}
	Set<IPLPlayer>lowestScorer= new HashSet<>();
	if (lowestRunScorer != null) {
		lowestScorer.add(lowestRunScorer);
	}
	
	return lowestScorer;
	
}
// HIGHEST WICKET TAKER...
public Set<IPLPlayer> getAllPlayerswitHighestWicketTakerService() {
	Set<IPLPlayer>db =new HashSet<IPLPlayer>();
	dao = new IPLPlayerDao();
	db=dao.getAllPlayers();
	IPLPlayer highestWicketTaker=null;
	for (IPLPlayer iplPlayer : db) {
		if (iplPlayer.getWicket()>highestWicketTaker.getWicket()) {
			highestWicketTaker=iplPlayer;
		}
		
	}
	Set<IPLPlayer>highestWicket =new HashSet<>();
	if(highestWicket!=null) {
		highestWicket.add(highestWicketTaker);
	}
	
	return highestWicket;
}

}
