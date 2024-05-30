/**
 * Represents a Fox predator.
 *
 * @author Hanlu Shi
 * @version ver 1.1
 */
public class Fox extends Predator
{
    /**
     * Default constructor for the Fox class.
     * Calls the parent class Predator's default constructor.
     */
    public Fox()
    {
        super();
    }

    /**
     * Displays information about the fox.
     */
    @Override
    public void display()
    {
        System.out.println("Animal details: [alive Flag=" + aliveFlag + "]");
    }

    /**
     * Calculates the kill probability of a fox targeting penguins.
     *
     * @param dogNum The number of dogs in the colony.
     * @return The kill probability of a fox targeting penguins.
     */
    @Override
    public double getPenguinKillProbability(int dogNum)
    {
        // Implement the specific kill probability for a fox targeting penguins
        if (dogNum == 1)
        {
            return 0.02;
        }
        else if (dogNum == 2)
        {
            return 0.008;
        }
        return 0.08;
    }

    /**
     * Calculates the kill probability of a fox targeting chicks.
     *
     * @param dogNum The number of dogs in the colony.
     * @return The kill probability of a fox targeting chicks.
     */
    @Override
    public double getChickKillProbability(int dogNum)
    {
        // Implement the specific kill probability for a fox targeting chicks
        if (dogNum == 1)
        {
            return 0.02;
        }
        else if (dogNum == 2)
        {
            return 0.008;
        }
        return 0.08;
    }

    /**
     * Calculates the kill probability of a fox targeting eggs.
     *
     * @param dogNum The number of dogs in the colony.
     * @return The kill probability of a fox targeting eggs.
     */
    @Override
    public double getEggKillProbability(int dogNum)
    {
        // Implement the specific kill probability for a fox targeting eggs
        if (dogNum == 1)
        {
            return 0.02;
        }
        else if (dogNum == 2)
        {
            return 0.008;
        }
        return 0.08;
    }
}
