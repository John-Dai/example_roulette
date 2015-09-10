package roulette;

import util.ConsoleReader;


public class ColorBet extends Bet {
    public static final String description = "Red or Black";
    public static final int odds = 1;

    public ColorBet () {
        super(description, odds);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void betPrompt () {
        setChosenBet(ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED));
    }

    @Override
    public boolean checkBet (Wheel myWheel) {
        return myWheel.getColor().equals(getChosenBet());

    }

    @Override
    public ColorBet copy () {
        return new ColorBet();
    }

}
