import java.util.Arrays;
public class Yahtzee
{
    // instance variables - replace the example below with your own
    Die6 die1;
    Die6 die2;
    Die6 die3;
    Die6 die4;
    Die6 die5;
    Die6[] dice;
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

        dice = new Die6[] {die1, die2, die3, die4, die5}; //stores references to dice array
    }

    public void roll() { 
        for (Die6 die : dice) { //iterates through dice array and rolls each die
            die.roll();
        }
    }

    public void roll (int dieNumber){ //rolls specific die by die number if it is within valid range 
        if (dieNumber >= 1 && dieNumber <= 5) {
            dice[dieNumber - 1].roll();
        }
    }

    public String summarize() { //Counts the occurrences of dice values and summarizes them in string format
        int [] counts = new int [6];
        for (Die6 dice : new Die6[] {die1, die2, die3, die4, die5}) { 
            counts [dice.getValue() - 1]++;
        }

        StringBuilder summary = new StringBuilder(); 
        for (int i= 0; i < counts.length; i++) {
            summary.append((i+1)+ "-" + counts[i]);
            if(i < counts.length-1){
                summary.append(";");
            }
        }
        return summary.toString();
    }
    
    public String toString(){ //Displays the current values of all five dice in a string format
        return "Dice values: " + Arrays.toString(Arrays.stream(dice).mapToInt(Die6::getValue).toArray()); //convert dice array into integers representing their values
    }
}
