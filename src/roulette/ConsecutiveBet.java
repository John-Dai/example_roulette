package roulette;

import util.ConsoleReader;


public class ConsecutiveBet extends Bet {
    public static final String description = "Three in a Row";
    public static final int odds = 11;

    public ConsecutiveBet () {
        super(description, odds);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void betPrompt () {
        setChosenBet("" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                                                    1, Wheel.NUM_SPOTS - 3));
    }

    @Override
    public boolean checkBet (Wheel myWheel) {
        int start = Integer.parseInt(getChosenBet());
        return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
    }

    @Override
    public ConsecutiveBet copy () {
        return new ConsecutiveBet();
    }
}
