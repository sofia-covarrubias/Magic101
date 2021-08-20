public class Golem extends Enemy
{
    // instance variables
    private GolemType elementType;
    private String strElementType;

    // enum elements
    enum GolemType
    {
        WATER, EARTH, FIRE, AIR
    } // end enum class

    // constructor
    public Golem (boolean hasClaws, String strElementType)
    {
        super(hasClaws);
        this.strElementType = strElementType;
        validateType();
    } // end multi-arg constructor

    // getters
    public GolemType getElementType ()
    {
        return elementType;
    } // end getElementType method
    public String getStrElementType ()
    {
        return strElementType;
    } // end getStrElementType method

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

    // toString method
    public String toString ()
    {
        String output = super.toString();
        output += "\nElement Type: " + elementType + "\n";
        return output;
    } // end toString method

} // end Golem class
