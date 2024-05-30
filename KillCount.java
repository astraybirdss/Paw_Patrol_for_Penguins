/**
 * Store details of the hunting numberpf predators.
 *
 * @author Hanlu Shi
 * @version ver 1.1
 */
public class KillCount
{
    private int malePenguins;
    private int femalePenguins;
    private int chicks;
    private int eggs;

    /**
     * Default constructor.
     */
    public KillCount()
    {
    }

    /**
     * Non-default constructor.
     *
     * @param malePenguins   The number of male penguins.
     * @param femalePenguins The number of female penguins.
     * @param chicks         The number of chicks.
     * @param eggs           The number of eggs.
     */
    public KillCount(int malePenguins, int femalePenguins, int chicks, int eggs)
    {
        this.malePenguins = malePenguins;
        this.femalePenguins = femalePenguins;
        this.chicks = chicks;
        this.eggs = eggs;
    }

    /**
     * Get the number of chicks.
     *
     * @return The number of chicks.
     */
    public int getChicks()
    {
        return chicks;
    }

    /**
    * Retrieves the number of eggs.
    *
    * @return The number of eggs.
    */
    public int getEggs()
    {
        return eggs;
    }

    /**
     * Get the number of female penguins.
     *
     * @return The number of female penguins.
     */
    public int getFemalePenguins()
    {
        return femalePenguins;
    }

    /**
     * Get the number of male penguins.
     *
     * @return The number of male penguins.
     */
    public int getMalePenguins()
    {
        return malePenguins;
    }

    /**
     * Set the number of chicks.
     *
     * @param chicks The new number of chicks.
     */
    public void setChicks(int chicks)
    {
        this.chicks = chicks;
    }

    /**
     * Set the number of eggs.
     *
     * @param eggs The new number of eggs.
     */
    public void setEggs(int eggs)
    {
        this.eggs = eggs;
    }

    /**
     * Set the number of female penguins.
     *
     * @param femalePenguins The new number of female penguins.
     */
    public void setFemalePenguins(int femalePenguins)
    {
        this.femalePenguins = femalePenguins;
    }

    /**
     * Set the number of male penguins.
     *
     * @param malePenguins The new number of male penguins.
     */
    public void setMalePenguins(int malePenguins)
    {
        this.malePenguins = malePenguins;
    }

    /**
     * Get a string representation of the object's state.
     *
     * @return A string representation of the object's state.
     */
    @Override
    public String toString()
    {
        return "KillCount [malePenguins=" + malePenguins + ", femalePenguins=" + femalePenguins + ", chicks=" + chicks
                + ", eggs=" + eggs + "]";
    }
}
