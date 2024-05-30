/**
 * Represents a cat, which is a predator.
 *
 * @author Hanlu Shi
 * @version ver 1.1
 */
public class Cat extends Predator
{

    /**
     * Constructs a Cat object.
     * Calls the default constructor of the parent class Predator.
     */
    public Cat()
    {
        super();
    }

    /**
     * Overrides the method to calculate the kill probability of a cat targeting chicks.
     *
     * @param dogNum The number of dogs.
     * @return The kill probability of the cat targeting chicks.
     */
    @Override
    public double getChickKillProbability(int dogNum)
    {
        // Implement the specific kill probability for a cat targeting chicks
        if (dogNum == 1)
        {
            return 0.01;
        }
        else if (dogNum == 2)
        {
            return 0.004;
        }
        return 0.04;
    }

    /**
     * Displays information about the cat.
     */
    @Override
    public void display()
    {
        System.out.println("Animal details: [alive Flag=" + aliveFlag + "]");
    }

    /**
     * Overrides the method to calculate the kill probability of a cat targeting eggs.
     *
     * @param dogNum The number of dogs.
     * @return The kill probability of the cat targeting eggs.
     */
    @Override
    public double getEggKillProbability(int dogNum)
    {
        // Implement the specific kill probability for a cat targeting eggs
        return 0.0;
    }

    /**
     * Overrides the method to calculate the kill probability of a cat targeting penguins.
     *
     * @param dogNum The number of dogs.
     * @return The kill probability of the cat targeting penguins.
     */
    @Override
    public double getPenguinKillProbability(int dogNum)
    {
        // Implement the specific kill probability for a cat targeting penguins
        if (dogNum == 1)
        {
            return 0.01;
        } 
        else if (dogNum == 2)
        {
            return 0.004;
        }
        return 0.04;
    }
}
