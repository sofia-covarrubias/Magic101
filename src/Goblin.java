public class Goblin extends Enemy
{
    // --- instance variables ---
    private int numClaws; // number of claws per foot
    private int mischiefLevel;
    private static int count;

    // --- constructor ---
    public Goblin (boolean hasClaws, int numClaws, int mischiefLevel)
    {
        super(hasClaws);
        this.numClaws = numClaws;
        this.mischiefLevel = mischiefLevel;
        validateClaws();
        count++;
    } // end multi-arg constructor

    public Goblin (boolean hasClaws)
    {
        super(hasClaws);
        this.numClaws = 3; // 3 is the default
        this.mischiefLevel = 5;
        validateClaws();
        count++;
    } // end empty constructor

    // --- setters ---
    public void setNumClaws (int numClaws)
    {
        this.numClaws = numClaws;
        validateClaws();
    } // end setter

    public void setMischiefLevel (int mischiefLevel)
    {
        this.mischiefLevel = mischiefLevel;
        validateLevel();
    } // end setter

    // --- getters ---
    public int getNumClaws ()
    {
        return numClaws;
    } // end getter

    public int getMischiefLevel ()
    {
        return mischiefLevel;
    } // end getter
    public static int getCount ()
    {
        return count;
    } // end getter

    // --- validation method ---
    private void validateClaws ()
    {
        if (super.getHasClaws()) // if it has claws, validate
        {
            if (numClaws > 10 || numClaws <= 0) // ensure it is not over 10 and is not negative
            {
                numClaws = 3; // default amount of claws per foot is 3 claws
            } // end inner if statement
        } // end outer if statement
        else if (!super.getHasClaws()) // if it does not, set num claws to 0
        {
            if (numClaws != 0)
            {
                numClaws = 0;
            } // end inner if statement
        } // end outer else if  statement

    } // end validateClaws method

    private void validateLevel ()
    {
        if (mischiefLevel < 0 || mischiefLevel > 10) // ensure 0-10 scale
        {
            mischiefLevel = 5; // default level of mischief level
        } // end if statement
    } // end validateLevel method

    // --- brain methods ---

    // toString
    public String toString ()
    {
        validateClaws();
        String output = super.toString();
        output += "\nThis goblin has " + numClaws + " claws.\n"
                + "Mischief Level? " + mischiefLevel + "\n";
        return output;
    } // end toString

} // end Goblin class
