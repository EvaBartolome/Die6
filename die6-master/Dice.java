
public class Dice
{
    // instance variables - replace the example below with your own
    Die6 die1;
    Die6 die2;

    /**
     * Constructor for objects of class Dice
     */
    public Dice()
    {
        // initialise instance variables
        die1 = new Die6();
        die2 = new Die6();
    }

    public void roll() {
        die1.roll();
        die2.roll();
    }

    public int getValue() {
        return die1.getValue()+die2.getValue();
    }

    public int rollAndGetValue() {
        roll();
        return getValue();
    }
}
