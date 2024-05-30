import java.util.*;

/**
 * Store details of the chick.
 * Extends the Egg class.
 *
 * @author Hanlu Shi
 * @version ver 1.1
 */
public class Chick extends Egg
{
    private int chickAge;
    private char gender;

    /**
     * Constructs a Chick object with default values.
     * Calls the default constructor of the parent class Egg.
     * Sets a random gender ('M' for male, 'F' for female).
     * Sets the chick's age to 1 month.
     */
    public Chick()
    {
        super();
        Random random = new Random();
        this.gender = random.nextBoolean() ? 'M' : 'F';
        this.chickAge = 1;
    }

    /**
     * Constructs a Chick object with the given chick age and gender.
     * Calls the default constructor of the parent class Egg.
     *
     * @param chickAge The age of the chick.
     * @param gender   The gender of the chick.
     */
    public Chick(int chickAge, char gender)
    {
        super();
        this.gender = gender;
        this.chickAge = chickAge;
    }

    /**
     * Displays the details of the chick.
     */
    public void display()
    {
        System.out.println("[Chick gender=" + gender + ", chick age=" + chickAge + "]");
    }

    /**
     * Retrieves the age of the chick.
     *
     * @return The age of the chick.
     */
    public int getChickAge()
    {
        return chickAge;
    }

    /**
     * Retrieves the gender of the chick.
     *
     * @return The gender of the chick.
     */
    public char getGender()
    {
        return gender;
    }

    /**
     * Sets the age of the chick.
     *
     * @param chickAge The age of the chick.
     */
    public void setChickAge(int chickAge)
    {
        this.chickAge = chickAge;
    }

    /**
     * Sets the gender of the chick.
     *
     * @param gender The gender of the chick.
     */
    public void setGender(char gender)
    {
        this.gender = gender;
    }

    /**
     * Returns a string representation of the chick.
     *
     * @return A string representation of the chick.
     */
    @Override
    public String toString()
    {
        return "[Chick gender=" + gender + ", chick age=" + chickAge + "]";
    }
}
