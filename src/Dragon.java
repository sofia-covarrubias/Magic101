public class Dragon extends Enemy
{
    // instance variables
    private int wingNum; // this needs to be even
    private double wingLen; // can't be negative and is in feet
    private static int count;

    // constructors
    public Dragon (boolean hasClaws, int wingNum, double wingLen)
    {
        super(hasClaws);
        this.wingNum = wingNum;
        this.wingLen = wingLen;
        validateWings();
        count++;
    } // end multi-arg constructor

    public Dragon (boolean hasClaws)
    {
        super(hasClaws);
        wingNum = 2; // 2 wings
        wingLen = 10; // 10 feet
        count++;
    } // end empty constructor

    // getters
    public int getWingNum ()
    {
        return wingNum;
    } // end getter
    public double getWingLen ()
    {
        return wingLen;
    } // end getter
    public static int getCount ()
    {
        return count;
    } // end getter

    // setters
    public void setWingNum ()
    {
        this.wingNum = wingNum;
        validateWings();
    } // end setter
    public void setWingLen ()
    {
        this.wingLen = wingLen;
        validateWings();
    } // end setter

    // validation
    private void validateWings ()
    {
        // validate number of wings
        if (wingNum % 2 != 0 || wingNum == 0) // if odd or 0
        {
            wingNum = 2;
        } // end if
        if (!(wingLen > 0 && wingLen <= 55))
        {
            wingLen = 10; // 10 feet
        } // end if
    } // end checkWings method

    // brain method

    // toString method
    public String toString ()
    {
        String output = super.toString();
        output += "\nThis dragon has " + wingNum + " wings that are each " + wingLen + " feet long!\n";
        return output;
    } // end toString method

} // end Dragon class
