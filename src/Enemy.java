public abstract class Enemy
{
    // instance variables
    private boolean hasClaws;
    private double health;

    // constructors
    public Enemy (boolean hasClaws, double health)
    {
        this.hasClaws = hasClaws;
        this.health = health;
    } // end constructor

    public Enemy ()
    {
        hasClaws = false;
        health = 100.0;
    } // end empty constructor

    // getters
    public boolean getHasClaws ()
    {
        return hasClaws;
    } // end getter
    public double getHealth ()
    {
        return health;
    }

    // setters
    public void setHasClaws (boolean hasClaws)
    {
        this.hasClaws = hasClaws;
    } // end setter
    public void setHealth (double health)
    {
        this.health = health;
    } // end setter

    // abstract method
    public abstract double attack ();

    // toString method
    @Override
    public String toString ()
    {
        return "This bad boy has claws? " + hasClaws
                + "\nCurrent Health: " + health;
    } // end toString method

} // end Enemies class
