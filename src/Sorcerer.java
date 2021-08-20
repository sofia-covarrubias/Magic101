public class Sorcerer
{
    // instance variables
    private String name;
    private String spells;
    private int rank;
    private double health;

    // constructors
    public Sorcerer (String name, String spells, int rank, double health)
    {
        this.name = name;
        this.spells = spells;
        this.rank = rank;
        this.health = health;
    } // end multi-arg constructor

    public Sorcerer ()
    {
        name = "Guest";
        spells = "unknown";
        rank = 0;
        health = 100;
    } // end empty constructor

    // getters
    public String getName ()
    {
        return name;
    } // end getName method
    public String getSpells ()
    {
        return spells;
    } // end getSpells method
    public int getRank ()
    {
        return rank;
    } // end getRank method
    public double getHealth ()
    {
        return health;
    } // end getHealth method

    // setters
    public void setName (String name)
    {
        this.name = name;
    } // end setName method
    public void setSpells (String spells)
    {
        this.spells = spells;
    } // end setSpells method
    public void setRank (int rank)
    {
        this.rank = rank;
    } // end setRank method
    public void setHealth (double health)
    {
        this.health = health;
    } // end setHealth method

    // validation

    // brain method

    // toString method

} // end Sorcerer class
