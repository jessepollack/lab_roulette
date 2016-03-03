package roulette;

import java.util.List;

import util.ConsoleReader;

public class BetFactory {

	Bet[] myPossibleBets;
	
	public BetFactory(){
		myPossibleBets=new Bet[3];
		myPossibleBets[0] = new RedBlack("Red or Black",1);
		myPossibleBets[1] = new OddEven("Odd or Even",1);
		myPossibleBets[2] = new ThreeConsecutive("Three in a Row",11);
	}
	
	 public Bet promptForBet () {
	        System.out.println("You can make one of the following types of bets:");
	        for (int k = 0; k < myPossibleBets.length; k++) {
	            System.out.println(String.format("%d) %s", (k + 1), myPossibleBets[k]));
	        }
	        int response = ConsoleReader.promptRange("Please make a choice", 1, myPossibleBets.length);
	        return myPossibleBets[response - 1];
	    }
}
