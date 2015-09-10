package roulette;

import util.ConsoleReader;


public class BetList {

    private Bet[] myPossibleBets = {
                                     new ColorBet(),
                                     new EvenOrOddBet(),
                                     new ConsecutiveBet()
    };

    /**
     * Prompt the user to make a bet from a menu of choices.
     */
    public Bet promptForBet () {
        System.out.println("You can make one of the following types of bets:");
        for (int k = 0; k < myPossibleBets.length; k++) {
            System.out
                    .println(String.format("%d) %s", (k + 1), myPossibleBets[k].getDescription()));
        }
        int selection =
                ConsoleReader.promptRange("Please make a choice", 1, myPossibleBets.length) - 1;
        return myPossibleBets[selection].copy();
    }

}
