package roulette;

import util.ConsoleReader;


/**
 * Plays a game of roulette.
 *
 * @author Robert C. Duvall
 */
public class Game {
    // name of the game
    private static final String DEFAULT_NAME = "Roulette";
    // bets player can make

    private BetList myPossibleBets = new BetList();

    private Wheel myWheel;

    /**
     * Construct the game.
     */
    public Game () {
        myWheel = new Wheel();
    }

    /**
     * @return name of the game
     */
    public String getName () {
        return DEFAULT_NAME;
    }

    /**
     * Play a round of roulette.
     *
     * Prompt player to make a bet, then spin the roulette wheel, and then verify
     * that the bet is won or lost.
     *
     * @param player one that wants to play a round of the game
     */
    public void play (Gambler player) {
        int amount = ConsoleReader.promptRange("How much do you want to bet",
                                               0, player.getBankroll());

        Bet currentBet = myPossibleBets.promptForBet();
        currentBet.betPrompt();

        System.out.print("Spinning ...");
        myWheel.spin();
        System.out.println(String.format("Dropped into %s %d", myWheel.getColor(),
                                         myWheel.getNumber()));
        if (currentBet.checkBet(myWheel)) {
            System.out.println("*** Congratulations :) You win ***");
            amount *= currentBet.getOdds();
        }
        else {
            System.out.println("*** Sorry :( You lose ***");
            amount *= -1;
        }
        player.updateBankroll(amount);
    }
}
