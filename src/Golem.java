public class Golem extends Enemy
{
    // instance variables
    private GolemType elementType;
    private String strElementType;
    private static int count;

    // enum elements
    enum GolemType
    {
        WATER, EARTH, FIRE, AIR
    } // end enum class

    // constructor
    public Golem (boolean hasClaws, double health, String strElementType)
    {
        super(hasClaws, health);
        this.strElementType = strElementType;
        validateType();
        count++;
    } // end multi-arg constructor

    public Golem (boolean hasClaws, double health)
    {
        super(hasClaws, health);
        strElementType = "earth";
        validateType();
        count++;
    } // end empty constructor

    // getters
    public GolemType getElementType ()
    {
        return elementType;
    } // end getElementType method
    public String getStrElementType ()
    {
        return strElementType;
    } // end getStrElementType method
    public static int getCount ()
    {
        return count;
    } // end getter

    // setters
    public void setElementType (GolemType elementType)
    {
        this.elementType = elementType;
    } // end setElementType method
    public void setStrElementType (String strElementType)
    {
        this.strElementType = strElementType;
        validateType();
    } // end setStrElementType

    // validation method
    private void validateType ()
    {
        if (strElementType.equalsIgnoreCase("water"))
        {
            elementType = GolemType.WATER;
        } // end if
        else if (strElementType.equalsIgnoreCase("earth"))
        {
            elementType = GolemType.EARTH;
        } // end else if
        else if (strElementType.equalsIgnoreCase("fire"))
        {
            elementType = GolemType.FIRE;
        } // end else if
        else if (strElementType.equalsIgnoreCase("air"))
        {
            elementType = GolemType.AIR;
        } // end else if
        else
        {
            elementType = GolemType.EARTH; // earth is the default one (most normal one)
            strElementType = "earth";
        } // end else
    } // end validateType

    // brain method
    public double attack ()
    {
        if (elementType == GolemType.AIR || elementType == GolemType.WATER)
        {
            System.out.println("The " + elementType + " golem ha s attacked with a fist smash! -10% health");
            return 10;
        } // end if statement
        else
        {
            System.out.println("The " + elementType + " golem has attacked by stomping on you! -25% health");
            return 25;
        } // end else clause
    } // end attack method

    // toString method
    public String toString ()
    {
        String output = super.toString();
        output += "\nElement Type: " + elementType + "\n";
        return output;
    } // end toString method

} // end Golem class
