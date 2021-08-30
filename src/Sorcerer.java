public class Sorcerer
{
    // instance variables
    private String name;
    private int rank;
    private double health;
    private boolean usedEmergency;
    private static int count;

    // constructors
    public Sorcerer (String name, int rank)
    {
        this.name = name;
        this.rank = rank;
        health = 100;
        usedEmergency = false;
        count++;
    } // end multi-arg constructor

    public Sorcerer ()
    {
        name = "Guest";
        rank = 0;
        health = 100;
        usedEmergency = false;
        count++;
    } // end empty constructor

    // getters
    public String getName ()
    {
        return name;
    } // end getName method
    public int getRank ()
    {
        return rank;
    } // end getRank method
    public double getHealth ()
    {
        return health;
    } // end getHealth method
    public static int getCount ()
    {
        return count;
    }

    // setters
    public void setName (String name)
    {
        this.name = name;
    } // end setName method
    public void setRank (int rank)
    {
        this.rank = rank;
    } // end setRank method
    public void setHealth (double health)
    {
        this.health = health;
    } // end setHealth method

    // brain method

    public void emergencyHealth ()
    {
        if (usedEmergency == true)
        {
            System.out.println("\nSorry, you have already used up your emergency health supply! :(\n");
        } // end if statement
        else
        {
            rank += 15;
            System.out.println("You have been granted 15% more health!" + "\nCurrent Health: " + health);
        } // end else statement
    } // end emergencyHealth method

    public double attack ()
    {
        double damage = 0;
        damage = rank * 10;
        if (usedEmergency == true)
        {
            damage /= 5;
        }
        return damage;
    }

    // toString method
    public String toString ()
    {
        String output = "\nName: " + name
                + "\nRank: " + rank
                + "\nHealth: " + health;
        return output;
    } // end toString method

} // end Sorcerer class
