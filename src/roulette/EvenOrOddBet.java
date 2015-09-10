package roulette;

import util.ConsoleReader;


public class EvenOrOddBet extends Bet {
    public static final String description = "Odd or Even";
    public static final int odds = 1;

    public EvenOrOddBet () {
        super(description, odds);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void betPrompt () {
        setChosenBet(ConsoleReader.promptOneOf("Please bet", "even", "odd"));
    }

    @Override
    public boolean checkBet (Wheel myWheel) {
        // TODO Auto-generated method stub
        return (myWheel.getNumber() % 2 == 0 && getChosenBet().equals("even")) ||
               (myWheel.getNumber() % 2 == 1 && getChosenBet().equals("odd"));
    }

    @Override
    public EvenOrOddBet copy () {
        return new EvenOrOddBet();
    }

}
