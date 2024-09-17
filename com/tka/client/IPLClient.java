package com.tka.client;

import java.util.Set;
import com.tka.controller.IPLController;
import com.tka.entity.IPLPlayer;

public class IPLClient {

	public static void main(String[] args) {
		IPLController cont= new IPLController();


		Set<IPLPlayer> db= cont.getAllPlayersController();
		for (IPLPlayer iplPlayer : db) {
			System.out.println(iplPlayer);

		}


		System.out.println("------------------------------------------------------------------------------------------------------------------->");
		System.out.println();
		Set<IPLPlayer> db1= cont.getAllPlayerswithSameTeamController("GT");
		for (IPLPlayer iplPlayer : db1) {
			System.out.println(iplPlayer);

		}
		System.out.println("-------------------------------------------------------------------------------------------------------------------->");
		System.out.println();
		Set<IPLPlayer> db2= cont.getAllPlayerswithsametRunController(5200);
		for (IPLPlayer iplPlayer : db2) {

			System.out.println(iplPlayer);
		}
		System.out.println("----------------------------------------------------------------------------------------------------------------------->");
		System.out.println();
		Set<IPLPlayer>  HighestRunScorer= cont.getAllPlayerswitHighestRunController();
		for (IPLPlayer iplPlayer : HighestRunScorer) {
			System.out.println(iplPlayer);
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------------>");
		System.out.println();
		Set<IPLPlayer>  LowestRunScorer= cont.getAllPlayerswitLowestRunController();
		for (IPLPlayer iplPlayer : LowestRunScorer) {
			System.out.println(iplPlayer);
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------------>");
		System.out.println();
		Set<IPLPlayer>  HighestWicketTaker= cont.getAllPlayerswitHighestWicketTakerController();
		for (IPLPlayer iplPlayer : HighestWicketTaker) {
			System.out.println(iplPlayer);
		}
	}
}
