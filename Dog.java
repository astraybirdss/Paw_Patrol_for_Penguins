/**
 * Represents a Dog.
 *
 * @author Hanlu Shi
 * @version ver 1.1
 */
public class Dog
{
    private double killProbability;

    /**
     * Constructs a Dog object with default values.
     */
    public Dog()
    {
        super();
    }

    /**
     * Constructs a Dog object with the specified kill probability.
     *
     * @param killProbability The kill probability of the dog.
     */
    public Dog(double killProbability)
    {
        super();
        this.killProbability = killProbability;
    }

    /**
     * Displays the kill probability of the dog.
     */
    public void display()
    {
        System.out.println("Dog kill probability: " + killProbability);
    }

    /**
     * Retrieves the kill probability of the dog.
     *
     * @return The kill probability of the dog.
     */
    public static double getKillProbability(int num)
    {
        // Implement the specific kill probability for a shark targeting penguins
        if (num == 1)
        {
            return 0.01;
        }
        else if (num == 2)
        {
            return 0.1;
        }
        else
        {
            return 0.0;
        }
    }

    /**
     * Sets the kill probability of the dog.
     *
     * @param killProbability The kill probability of the dog.
     */
    public void setKillProbability(double killProbability)
    {
        this.killProbability = killProbability;
    }


    /**
     * Returns a string representation of the Dog object.
     *
     * @return A string representation of the Dog object.
     */
    @Override
    public String toString()
    {
        return "Dog [killProbability=" + killProbability + "]";
    }
}
