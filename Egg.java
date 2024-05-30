/**
 * Store details of the egg.
 *
 * @author Hanlu Shi
 * @version ver 1.1
 */

import java.util.*;

public class Egg extends Penguin
{
    private boolean isHatched;
    private PenguinFamily family;


    public Egg()
    {
        super(); //Calls the parent class Penguin default constructor
        this.isHatched = false;
        this.family = null;
    }

    public Egg(boolean isHatched, PenguinFamily family)
    {
        super(); //Calls the parent class Penguin non-default constructor
        this.isHatched = isHatched;
        this.family = family;
    }

    public void display()
    {
        System.out.println("[Egg: alive Flag=" + aliveFlag +", " +"is hatched flag=" + isHatched + "]");
    }

    /**
     * Hatches the egg and adds a new chick to the family.
     *
     * @param family The family of the egg.
     * @return True if the hatch is successful, false otherwise.
     */
    public boolean hatch(PenguinFamily family)
    {
        if (this.aliveFlag)
        {

            Random random = new Random();
            int randomNumber = random.nextInt(10) + 1; // Generate a random number from 1-10

            if (randomNumber <= 7) // If the random number is not bigger than 7, then it is a successful hatch
            {
                isHatched = true; //If the hatch is successful
                this.aliveFlag = false;
                family.getFamilyChicks().add(new Chick());
                return true;
            }
            else
            {
                isHatched = false; //If the hatch is unsuccessful
                this.aliveFlag = false;
            }
        }
        return false;
    }

    /**
     * Retrieves the family of the egg.
     *
     * @return The family of the egg.
     */
    public PenguinFamily getFamily()
    {
        return family;
    }

    /**
     * Retrieves the hatched status of the egg.
     *
     * @return The hatched status of the egg.
     */
    public boolean getIsHatched()
    {
        return isHatched;
    }

    /**
     * Sets the family of the egg.
     *
     * @param family The family of the egg.
     */
    public void setFamily(PenguinFamily family)
    {
        this.family = family;
    }

    /**
     * Sets the hatched status of the egg.
     *
     * @param isHatched The hatched status of the egg.
     */
    public void setIsHatched(boolean isHatched)
    {
        this.isHatched = isHatched;
    }

}
