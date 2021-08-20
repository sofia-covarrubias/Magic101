public class Enemy
{
    // instance variables
    private boolean hasClaws;

    // constructors
    public Enemy (boolean hasClaws)
    {
        this.hasClaws = hasClaws;
    } // end constructor
    public Enemy ()
    {
        hasClaws = false;
    } // end empty constructor

    // getters
    public boolean getHasClaws ()
    {
        return hasClaws;
    } // end getter

    // setters
    public void setHasClaws (boolean hasClaws)
    {
        this.hasClaws = hasClaws;
    } // end setter


    // toString method
    @Override
    public String toString ()
    {
        return "This bad boy has claws? " + hasClaws;
    } // end toString method

} // end Enemies class
