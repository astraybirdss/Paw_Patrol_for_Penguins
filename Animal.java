/**
 * Represents an animal.
 *
 * @author Hanlu Shi
 * @version ver 1.1
 */
public class Animal
{
    protected boolean aliveFlag;

    /**
     * Constructs an Animal object with the default alive flag set to true.
     */
    public Animal()
    {
        this.aliveFlag = true;
    }

    /**
     * Constructs an Animal object with the given alive flag.
     *
     * @param aliveFlag The alive flag of the animal.
     */
    public Animal(boolean aliveFlag)
    {
        this.aliveFlag = aliveFlag;
    }

    /**
     * Displays the details of the animal.
     */
    public void display()
    {
        System.out.println("Animal details: [alive Flag=" + aliveFlag + "]");
    }

    /**
     * Retrieves the alive flag of the animal.
     *
     * @return The alive flag of the animal.
     */
    public boolean getAliveFlag()
    {
        return aliveFlag;
    }

    /**
     * Sets the alive flag of the animal.
     *
     * @param aliveFlag The alive flag of the animal.
     */
    public void setAliveFlag(boolean aliveFlag)
    {
        this.aliveFlag = aliveFlag;
    }
}
