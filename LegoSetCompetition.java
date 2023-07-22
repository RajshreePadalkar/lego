package com.gurukul.day5;

import java.util.Scanner;

class CompetitionLog {
    private int PlayerNumber, piecesBuilt;
    String completeSets, incompleteSets;
    static int count, a = 1;

    CompetitionLog() {
    }

    CompetitionLog(int PlayerNumber, int piecesBuilt, String completeSets, String incompleteSets) {
	this.PlayerNumber = PlayerNumber;
	this.piecesBuilt = piecesBuilt;
	this.completeSets = completeSets;
	this.incompleteSets = incompleteSets;
    }

    public int getPlayerNumber() {
	return PlayerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
	PlayerNumber = playerNumber;
    }

    public int getPiecesBuilt() {
	return piecesBuilt;
    }

    public void setPiecesBuilt(int piecesBuilt) {
	this.piecesBuilt = piecesBuilt;
    }

    public String getCompleteSets() {
	return completeSets;
    }

    public void setCompleteSets(String completeSets) {
	this.completeSets = completeSets;
    }

    public String getIncompleteSets() {
	return incompleteSets;
    }

    public void setIncompleteSets(String incompleteSets) {
	this.incompleteSets = incompleteSets;
    }

    public String toString() {
	return "Player " + PlayerNumber + "Completed the following Sets :" + completeSets + "\n Player" + PlayerNumber
		+ "didnot completed the following sets:" + incompleteSets + "\n Player " + PlayerNumber
		+ " built total of " + piecesBuilt + " pieces";
    }

    public String print(CompetitionLog t) {
	// TODO Auto-generated method stub
	String str = "Congratulations to player " + this.getPlayerNumber() + " for winning the Lego Set Competition!"
		+ "\n" + "Additional information about the competition result is below\n" + "Player  "
		+ this.getPlayerNumber() + " completed the following sets:" + this.getCompleteSets() + "\n" + "Player "
		+ this.getPlayerNumber() + " incompleted the following sets:" + this.getIncompleteSets() + "\n"
		+ "Player " + this.PlayerNumber + " built a total of " + this.piecesBuilt + "pieces.\n"
		+ " Additional information about the competition results is below \n" + "Player " + t.PlayerNumber
		+ " completed the following sets:" + t.getCompleteSets() + "\n" + "Player " + t.PlayerNumber
		+ " incompleted the following sets:" + t.getIncompleteSets() + "\n" + "Player " + t.PlayerNumber
		+ " built a total of " + t.piecesBuilt + "pieces.\n" + "The competiton lasted " + a + "days.";
	return str;

    }

}

public class LegoSetCompetition {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	boolean b = true;
	System.out.println("Welcome to the Lego set Competition !");
	while (b) {
	    sc.nextLine();
	    System.out.println("Enter the name of Lego Set 1");
	    String name1 = sc.nextLine();

	    System.out.println("Enter the number of pieces Lego Set 1");
	    int p1 = sc.nextInt();
	    sc.nextLine();

	    System.out.println("Enter the name of Lego Set 2");
	    String name2 = sc.nextLine();

	    System.out.println("Enter the number of pieces Lego Set 2");
	    int p2 = sc.nextInt();
	    sc.nextLine();

	    System.out.println("Enter the name of Lego Set 3");
	    String name3 = sc.nextLine();

	    System.out.println("Enter the number of pieces Lego Set 3");
	    int p3 = sc.nextInt();
	    sc.nextLine();

	    CompetitionLog.count = p1 + p2 + p3;
	    CompetitionLog player1 = new CompetitionLog(1, 0, "", name1 + name2 + name3);
	    CompetitionLog player2 = new CompetitionLog(2, 0, "", name1 + name2 + name3);

	    while (player1.getPiecesBuilt() < CompetitionLog.count && player2.getPiecesBuilt() < CompetitionLog.count) {
		b = false;
		System.out.println("Enter the number of Pieces Player 1 used for building on day :" + CompetitionLog.a);
		int number1 = sc.nextInt();
		System.out.println("Enter the number of Pieces Player 2 used for building on day :" + CompetitionLog.a);
		int number2 = sc.nextInt();

		player1.setPiecesBuilt(player1.getPiecesBuilt() + number1);
		player2.setPiecesBuilt(player2.getPiecesBuilt() + number2);

		if (player1.getPiecesBuilt() >= p1) {
		    player1.setCompleteSets(name1);
		    player1.setIncompleteSets(name2 + name3);
		    if (player1.getPiecesBuilt() >= p1 + p2) {
			player1.setCompleteSets(name1 + name2);
			player1.setIncompleteSets(name3);
			if (player1.getPiecesBuilt() >= (p1 + p2 + p3)) {
			    player1.setCompleteSets(name1 + name2 + name3);
			    player1.setIncompleteSets("");
			}
		    }
		}
		if (player2.getPiecesBuilt() >= p1) {
		    player2.setCompleteSets(name1);
		    player2.setIncompleteSets(name2 + name3);
		    if (player2.getPiecesBuilt() >= p1 + p2) {
			player2.setCompleteSets(name1 + name2);
			player2.setIncompleteSets(name3);
			if (player2.getPiecesBuilt() >= (p1 + p2 + p3)) {
			    player2.setCompleteSets(name1 + name2 + name3);
			    player2.setIncompleteSets("");
			}
		    }
		}

		if (player1.getPiecesBuilt() >= CompetitionLog.count
			&& player2.getPiecesBuilt() >= CompetitionLog.count) {
		    player1.setPiecesBuilt(0);
		    player2.setPiecesBuilt(0);
		    System.out.println("The competition ended in a tie There will be a tiebreaker round ");
		    b = true;
		    break;
		}
		if (player1.getPiecesBuilt() >= CompetitionLog.count)
		    System.out.println(player1.print(player2));
		else if (player2.getPiecesBuilt() >= CompetitionLog.count)
		    System.out.println(player2.print(player1));

		CompetitionLog.a++;
	    }

	}
//	System.out.println(player1);
//	System.out.println(player2);

    }
}