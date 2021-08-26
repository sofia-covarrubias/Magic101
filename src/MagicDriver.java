public class MagicDriver
{
    public static void main (String[] args)
    {
        Dragon dragon1 = new Dragon (true,6, 2.5);
        Dragon dragon2 = new Dragon (false);

        Goblin goblin1 = new Goblin (true, 3, 3);
        Goblin goblin2 = new Goblin (false);

        Golem golem1 = new Golem (true, "air");
        Golem golem2 = new Golem (false);

        Sorcerer player1 = new Sorcerer ("Sofia", "unknown");

        Enemy[] allEnemies = {dragon1, dragon2, goblin1, goblin2, golem1, golem2};

        for (int i = 0; i < allEnemies.length; i++)
        {
            System.out.println(allEnemies[i].toString());
        }

        System.out.println(player1.toString());

        System.out.println(Dragon.getCount());
        System.out.println(Goblin.getCount());
        System.out.println(Golem.getCount());

    } // end main method

} // end MagicDriver class
