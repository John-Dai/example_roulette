package roulette;

/**
 * Represents player's attempt to bet on outcome of the roulette wheel's spin.
 *
 * @author Robert C. Duvall
 */
public abstract class Bet {
    private String myDescription;
    private int myOdds;
    private String myChosenBet;

    /**
     * Constructs a bet with the given name and odds.
     *
     * @param description name of this kind of bet
     * @param odds odds given by the house for this kind of bet
     */
    public Bet (String description, int odds) {
        myDescription = description;
        myOdds = odds;
        myChosenBet = "";
    }

    /**
     * @return odds given by the house for this kind of bet
     */
    public int getOdds () {
        return myOdds;
    }

    /**
     * @return name of this kind of bet
     */
    public String getDescription () {
        return myDescription;
    }

    protected void setChosenBet (String chosenBet) {
        myChosenBet = chosenBet;
    }

    protected String getChosenBet () {
        return myChosenBet;
    }

    public abstract void betPrompt ();

    public abstract boolean checkBet (Wheel myWheel);

    public abstract Bet copy ();
}
