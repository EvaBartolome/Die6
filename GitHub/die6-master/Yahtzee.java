
public class Yahtzee
{
    // instance variables - replace the example below with your own
    Die6 die1;
    Die6 die2;
    Die6 die3;
    Die6 die4;
    Die6 die5;

    /**
     * Constructor for objects of class Dice
     */
    public Yahtzee()
    {
        // initialise instance variables
        die1 = new Die6();
        die2 = new Die6();
        die3 = new Die6();
        die4 = new Die6();
        die5 = new Die6();
    }

    public void roll() {
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
    }

    public int getValue() {
        return die1.getValue()+ die2.getValue()+die3.getValue()+die4.getValue()+die5.getValue();
    }

    public int rollAndGetValue() {
        roll();
        return getValue();
    }
}
