package com.tka.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.tka.entity.IPLPlayer;

public class IPLPlayerDao {
	public Set<IPLPlayer> getAllPlayers(){
		//System.out.println("IPLPlayerDao->getAllPlayers");
		Set<IPLPlayer>db =new HashSet<>();
		db.add(new IPLPlayer(18, "Virat Kohli", 6000, 4, "RCB"));
		db.add(new IPLPlayer(7, "MS Dhoni", 5200, 0, "CSK"));
		db.add(new IPLPlayer(63, "Hardik Pandya", 1500, 35, "GT"));
		db.add(new IPLPlayer(45, "Rohit Sharma", 5500, 2, "MI"));
		db.add(new IPLPlayer(12, "Shikhar Dhawan", 5200, 1, "PBKS"));
		db.add(new IPLPlayer(3, "David Warner", 5800, 0, "DC"));
		db.add(new IPLPlayer(17, "Rashid Khan", 600, 110, "GT"));
		db.add(new IPLPlayer(33, "Pat Cummins", 300, 90, "KKR"));
		db.add(new IPLPlayer(25, "KL Rahul", 4000, 3, "LSG"));
		db.add(new IPLPlayer(99, "Jasprit Bumrah", 100, 120, "MI"));
		
		return db;
		 
  }

	}
