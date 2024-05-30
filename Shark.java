/**
 * The Shark class represents a shark predator that hunts penguins.
 *
 * @author Hanlu Shi
 * @version ver 1.1
 */
public class Shark extends Predator
{

    /**
     * Default constructor. Calls the parent class Predator default constructor.
     */
    public Shark()
    {
        super();
    }

    /**
     * Displays information about the shark.
     */
    @Override
    public void display()
    {
        System.out.println("Animal details: [alive Flag=" + aliveFlag + "]");
    }

    /**
     * Returns the probability of a shark killing a penguin based on the number of patrol dogs.
     *
     * @param dogNum the number of patrol dogs
     * @return the probability of killing a penguin
     */
    @Override
    public double getPenguinKillProbability(int dogNum)
    {
        // Implement the specific kill probability for a shark targeting penguins
        return 0.02;
    }

    /**
     * Returns the probability of a shark killing a chick based on the number of patrol dogs.
     *
     * @param dogNum the number of patrol dogs
     * @return the probability of killing a chick
     */
    @Override
    public double getChickKillProbability(int dogNum)
    {
        // Implement the specific kill probability for a shark targeting chicks
        return 0.0;
    }

    /**
     * Returns the probability of a shark killing an egg based on the number of patrol dogs.
     *
     * @param dogNum the number of patrol dogs
     * @return the probability of killing an egg
     */
    @Override
    public double getEggKillProbability(int dogNum)
    {
        // Implement the specific kill probability for a shark targeting eggs
        return 0.0;
    }
}
