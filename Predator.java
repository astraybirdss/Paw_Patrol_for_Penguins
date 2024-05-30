import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * The Predator class represents a predator that hunts penguins, chicks, and eggs.
 *
 * @author Hanlu Shi
 * @version ver 1.1
 */
public abstract class Predator extends Animal
{
    private static ArrayList<Chick> chicksKilled;
    private static ArrayList<Egg> eggsKilled;
    private static ArrayList<Penguin> malePenguinsKilled;
    private static ArrayList<Penguin> femalePenguinsKilled;

    /**
     * Default constructor. Initializes the lists of killed penguins, chicks, and eggs.
     */
    public Predator()
    {
        chicksKilled = new ArrayList<>();
        eggsKilled = new ArrayList<>();
        malePenguinsKilled = new ArrayList<>();
        femalePenguinsKilled = new ArrayList<>();
    }

    /**
     * Displays the number of penguins, chicks, and eggs killed by the predator.
     */
    public void display()
    {
        System.out.println("  - Penguins killed: " + malePenguinsKilled.size() + " male, " + femalePenguinsKilled.size() + " female");
        System.out.println("  - Chicks killed: " + chicksKilled.size());
        System.out.println("  - Eggs killed: " + eggsKilled.size());
    }

    /**
     * Displays the number of penguins, chicks, and eggs killed by the predator for the month.
     */
    public static void displayMonth()
    {
        System.out.println("  - Penguins killed: " + malePenguinsKilled.size() + " male, " + femalePenguinsKilled.size() + " female");
        System.out.println("  - Chicks killed: " + chicksKilled.size());
        System.out.println("  - Eggs killed: " + eggsKilled.size());
    }

    /**
     * Returns the probability of killing a chick based on the number of dogs.
     *
     * @param dogNum the number of patrol dogs
     * @return the probability of killing a chick
     */
    public abstract double getChickKillProbability(int dogNum);

    /**
     * Returns the probability of killing an egg based on the number of dogs.
     *
     * @param dogNum the number of patrol dogs
     * @return the probability of killing an egg
     */
    public abstract double getEggKillProbability(int dogNum);

    /**
    * Retrieves the list of female penguins killed.
    *
    * @return The list of female penguins killed.
    */
    public static ArrayList<Penguin> getFemalePenguinsKilled()
    {
        return femalePenguinsKilled;
    }

    /**
    * Retrieves the list of male penguins killed.
    *
    * @return The list of male penguins killed.
    */
    public static ArrayList<Penguin> getMalePenguinsKilled()
    {
        return malePenguinsKilled;
    }

    /**
     * Returns the probability of killing a penguin based on the number of dogs.
     *
     * @param dogNum the number of patrol dogs
     * @return the probability of killing a penguin
     */
    public abstract double getPenguinKillProbability(int dogNum);

    /**
     * Checks if there is any alive predator in the given list.
     *
     * @param list the list of predators to check
     * @return true if there is at least one alive predator, false otherwise
     */
    public static boolean hasAlive(List<? extends Predator> list)
    {
        for (Predator predator : list)
        {
            if (predator.getAliveFlag())
            {
                return true;
            }
        }
        return false;
    }

    /**
     * Sets the list of killed chicks.
     *
     * @param chicksKilled the list of killed chicks
     */
    public void setChicksKilled(ArrayList<Chick> chicksKilled)
    {
        this.chicksKilled = chicksKilled;
    }

    /**
     * Sets the list of killed eggs.
     *
     * @param eggsKilled the list of killed eggs
     */
    public void setEggsKilled(ArrayList<Egg> eggsKilled)
    {
        this.eggsKilled = eggsKilled;
    }

    /**
     * Sets the list of killed female penguins.
     *
     * @param femalePenguinsKilled the list of killed female penguins
     */
    public void setFemalePenguinsKilled(ArrayList<Penguin> femalePenguinsKilled)
    {
        this.femalePenguinsKilled = femalePenguinsKilled;
    }

    /**
     * Sets the list of killed male penguins.
     *
     * @param malePenguinsKilled the list of killed male penguins
     */
    public void setMalePenguinsKilled(ArrayList<Penguin> malePenguinsKilled)
    {
        this.malePenguinsKilled = malePenguinsKilled;
    }

    /**
     * Clears the lists of killed penguins, chicks, and eggs.
     */
    public static void toClear() {
        malePenguinsKilled.clear();
        femalePenguinsKilled.clear();
        chicksKilled.clear();
        eggsKilled.clear();
    }

    /**
     * Hunts penguins, chicks, and eggs from the given list of penguin families.
     *
     * @param families the list of penguin families to hunt
     * @param dogNum   the number of patrol dogs
     * @return the count of killed penguins, chicks, and eggs
     */
    public KillCount toHunt(List<PenguinFamily> families, int dogNum)
    {
        Random random = new Random();

        for (PenguinFamily family : families)
        {

            // Hunt male penguins
            if (family.getMalePenguin().getAliveFlag())
            {
                double chance = random.nextDouble();
                if (chance < getPenguinKillProbability(dogNum))
                {
                    family.getMalePenguin().setAliveFlag(false);
                    malePenguinsKilled.add(family.getMalePenguin());
                }
            }

            // Hunt female penguins
            if (family.getFemalePenguin().getAliveFlag())
            {
                double chance = random.nextDouble();
                if (chance < getPenguinKillProbability(dogNum))
                {
                    family.getFemalePenguin().setAliveFlag(false);
                    femalePenguinsKilled.add(family.getFemalePenguin());
                }
            }

            // Hunt chicks
            for (Chick chick : family.getFamilyChicks())
            {
                if (chick.getAliveFlag())
                {
                    double chance = random.nextDouble();
                    if (chance < getChickKillProbability(dogNum))
                    {
                        chick.setAliveFlag(false);
                        chicksKilled.add(chick);
                    }
                }
            }

            // Hunt eggs
            for (Egg egg : family.getFamilyEggs())
            {
                if (egg.getAliveFlag())
                {
                    double chance = random.nextDouble();
                    if (chance < getEggKillProbability(dogNum))
                    {
                        egg.setAliveFlag(false);
                        eggsKilled.add(egg);
                    }
                }
            }
        }

        KillCount killCount = new KillCount();
        killCount.setMalePenguins(malePenguinsKilled.size());
        killCount.setFemalePenguins(femalePenguinsKilled.size());
        killCount.setChicks(chicksKilled.size());
        killCount.setEggs(eggsKilled.size());
        return killCount;
    }
}
