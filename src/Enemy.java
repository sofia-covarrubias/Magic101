public abstract class Enemies
{
    // instance variables
    private boolean hasClaws;

    public Enemies (boolean hasClaws)
    {
        this.hasClaws = hasClaws;
    } // end constructor

    public Enemies ()
    {
        hasClaws = false;
    } // end empty constructor

    @Override
    public String toString ()
    {
        return "This bad boy has claws? " + hasClaws;
    } // end toString method


    // toString method
} // end Enemies class
