public class MagicDriver
{
    public static void main (String[] args)
    {
        // all object calls
        Dragon dragon1 = new Dragon (true, 100.0, 6, 2.5);
        Dragon dragon2 = new Dragon (false, 100.0);

        Goblin goblin1 = new Goblin (true, 100.0, 3, 3);
        Goblin goblin2 = new Goblin (false, 100.0);

        Golem golem1 = new Golem (true, 100.0, "air");
        Golem golem2 = new Golem (false, 100.0);

        Sorcerer player1 = new Sorcerer ("Sofia", 3);
        Sorcerer player2 = new Sorcerer ("Jayden", 4);

        // all general variables names
        int roundCount = 0;
        double dra1Health = 0;
        double dra1Damage = 0;
        double dra2Health = 0;
        double dra2Damage = 0;
        double gob1Health = 0;
        double gob1Damage = 0;
        double gob2Health = 0;
        double gob2Damage = 0;
        double gol1Health = 0;
        double gol1Damage = 0;
        double gol2Health = 0;
        double gol2Damage = 0;
        double playerDamage = 0;
        double playerHealth = 0;
        int groupSet = 0;
        int enemySet = 0;

        // ENEMY INFORMATION: toStrings and count of instances
        System.out.println("\nENEMY INFORMATION: ");

        System.out.println("\nTotal Dragons: " + Dragon.getCount());
        System.out.println("\nTotal Goblins: " + Goblin.getCount());
        System.out.println("\nTotal Golems: " + Golem.getCount() + "\n");

        Enemy[] allEnemies = {dragon1, dragon2, goblin1, goblin2, golem1, golem2};

        for (int i = 0; i < allEnemies.length; i++)
        {
            System.out.println(allEnemies[i].toString());
        } // end for loop

        // SORCERER INFORMATION: toString and count of instances
        System.out.println("\nSORCERER INFORMATION: ");
        System.out.println("\nTotal Sorcerors: " + Sorcerer.getCount());

        System.out.println(player1.toString());
        System.out.println(player2.toString());

        // testing Dragon's ability to inflict damage
        // playerHealth = player1.getHealth();
        // playerDamage = dragon1.attack();
        // player1.setHealth(playerHealth - playerDamage);

        // System.out.println(player1.toString());

        // actual rounds
        while (roundCount < 10)
        {
            // game using first set of enemies and player 1
            if (groupSet == 0) // chose dra1, gob1, gol1, p1
            {
                if (enemySet % 3 == 0) // chose dra1
                {
                    // dragon attacks, player health updates, shows player's new stats
                    System.out.println("Round " + (roundCount + 1) + ": Dragon #1 vs " + player1.getName());
                    System.out.println("\nDragon #1 is attacking first!");

                    playerHealth = player1.getHealth();
                    playerDamage = dragon1.attack();
                    player1.setHealth(playerHealth - playerDamage);

                    System.out.println(player1.getName() + "\'s stats:" + player1.toString());

                    // player attacks, dragon health updates, shows dragon's new stats
                    System.out.println("\nNow, " + player1.getName() + " is attacking now!");

                    dra1Health = dragon1.getHealth();
                    dra1Damage = player1.attack();
                    player1.setHealth(dra1Health - dra1Damage);

                    System.out.println("\nDragon #1's stats: " + dragon1.toString());
                } // end inner if statement
                else if (enemySet % 2 == 0)
                {
                    // goblin attacks, player health updates, shows player's new stats
                    System.out.println("Round  " + (roundCount + 1) + " Goblin #1 vs " + player1.getName());
                    System.out.println("\nGoblin #1 is attacking first!");

                    playerHealth = player1.getHealth();
                    playerDamage = goblin1.attack();
                    player1.setHealth(playerHealth - playerDamage);

                    System.out.println(player1.getName() + "\'s stats:" + player1.toString());

                    // player attacks, goblin health updates, shows goblins's new stats
                    System.out.println("\nNow, " + player1.getName() + " is attacking now!");

                    gob1Health = goblin1.getHealth();
                    gob1Damage = player1.attack();
                    goblin1.setHealth(gob1Health - gob1Damage);

                    System.out.println("\nGoblin #1's stats: " + goblin1.toString());
                }
                else
                {
                    // golem attacks, player health updates, shows player's new stats
                    System.out.println("Round " + (roundCount + 1) + " Golem #1 vs " + player1.getName());
                    System.out.println("\nGolem #1 is attacking first!");

                    playerHealth = player1.getHealth();
                    playerDamage = golem1.attack();
                    player1.setHealth(playerHealth - playerDamage);

                    System.out.println(player1.getName() + "\'s stats:" + player1.toString());

                    // player attacks, golem health updates, shows golem's new stats
                    System.out.println("\nNow, " + player1.getName() + " is attacking now!");

                    gol1Health = golem1.getHealth();
                    gol1Damage = player1.attack();
                    golem1.setHealth(gol1Health - gol1Damage);

                    System.out.println("\nGolem #1's stats: " + golem1.toString());
                }
                enemySet++;
            } // end if statement
            else // chose dra2, gob2, gol2, p2
            {
                if (enemySet % 3 == 0) // chose dra1
                {
                    // dragon attacks, player health updates, shows player's new stats
                    System.out.println("Round  " + (roundCount + 1) + " Dragon #2 vs " + player2.getName());
                    System.out.println("\nDragon #2 is attacking first!");

                    playerHealth = player2.getHealth();
                    playerDamage = dragon2.attack();
                    player2.setHealth(playerHealth - playerDamage);

                    System.out.println(player2.getName() + "\'s stats:" + player2.toString());

                    // player attacks, dragon health updates, shows dragon's new stats
                    System.out.println("\nNow, " + player2.getName() + " is attacking now!");

                    dra2Health = dragon2.getHealth();
                    dra2Damage = player2.attack();
                    player2.setHealth(dra2Health - dra2Damage);

                    System.out.println("\nDragon #2's stats: " + dragon2.toString());
                } // end inner if statement
                else if (enemySet % 2 == 0)
                {
                    // goblin attacks, player health updates, shows player's new stats
                    System.out.println("Round  " + (roundCount + 1) + " Goblin #2 vs " + player2.getName());
                    System.out.println("\nGoblin #2 is attacking first!");

                    playerHealth = player2.getHealth();
                    playerDamage = goblin2.attack();
                    player2.setHealth(playerHealth - playerDamage);

                    System.out.println(player2.getName() + "\'s stats:" + player2.toString());

                    // player attacks, goblin health updates, shows goblins's new stats
                    System.out.println("\nNow, " + player2.getName() + " is attacking now!");

                    gob2Health = goblin2.getHealth();
                    gob2Damage = player2.attack();
                    goblin2.setHealth(gob2Health - gob2Damage);
                    System.out.println("\nGoblin #2's stats: " + goblin2.toString());
                }
                else
                {
                    // golem attacks, player health updates, shows player's new stats
                    System.out.println("Round  " + (roundCount + 1) + " Golem #2 vs " + player2.getName());
                    System.out.println("\nGolem #2 is attacking first!");

                    playerHealth = player2.getHealth();
                    playerDamage = golem2.attack();
                    player2.setHealth(playerHealth - playerDamage);

                    System.out.println(player2.getName() + "\'s stats:" + player2.toString());

                    // player attacks, golem health updates, shows golem's new stats
                    System.out.println("\nNow, " + player2.getName() + " is attacking now!");

                    gol2Health = golem2.getHealth();
                    gol2Damage = player2.attack();
                    golem2.setHealth(gol2Health - gol2Damage);

                    System.out.println("\nGolem #2's stats: " + golem2.toString());
                }
                enemySet++;
            }

            // game using default second set of enemies and player 2
            roundCount++;
        } // end while loop

    } // end main method

} // end MagicDriver class
