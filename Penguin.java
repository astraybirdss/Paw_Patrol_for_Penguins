/**
 * Store details of the penguin, a subclass of the Animal class.
 *
 * @author Hanlu Shi
 * @version ver 1.1
 */
public class Penguin extends Animal
{
    private char gender;

    /**
     * Constructs a Penguin object with the default gender set to male.
     */
    public Penguin()
    {
        super(); // Calls the parent class Animal default constructor
        this.gender = 'M'; // Default gender is male
    }

    /**
     * Constructs a Penguin object with the specified gender.
     *
     * @param gender The gender of the penguin.
     */
    public Penguin(char gender)
    {
        super(); // Calls the parent class Animal non-default constructor
        this.gender = gender;
    }

    /**
     * Displays the details of the Penguin.
     */
    public void display()
    {
        System.out.println("Penguin [gender=" + gender + ", alive Flag=" + aliveFlag + "]");
    }

    /**
     * Get the gender of the penguin.
     *
     * @return The gender of the penguin.
     */
    public char getGender()
    {
        return gender;
    }

    /**
     * Set the gender of the penguin.
     *
     * @param gender The new gender of the penguin.
     */
    public void setGender(char gender)
    {
        this.gender = gender;
    }
}
