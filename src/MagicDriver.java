public class MagicDriver
{
    public static void main (String[] args)
    {
        Dragon diego = new Dragon (true, 5, 2.2);
        Goblin gary = new Goblin (true, 0, 100);
        Golem gabe = new Golem (true, "air");
        Enemy[] allEnemies = {diego, gary, gabe};
        for (int i = 0; i < allEnemies.length; i++)
        {
            System.out.println(allEnemies[i].toString());
        }
    } // end main method

} // end MagicDriver class
