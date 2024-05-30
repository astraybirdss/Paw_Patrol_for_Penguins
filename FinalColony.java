/**
 * Represents the final colony status with survival rates.
 *
 * @author Hanlu Shi
 * @version ver 1.1
 */
public class FinalColony
{
    private double familyGroupSurvivalRate;
    private double penguinSurvivalRate;
    private double eggSurvivalRate;
    private double chickSurvivalRate;
    private double overallColonySurvival;

    /**
     * Default constructor to create the object of class FinalColony.
     * Initializes all survival rates to 0.0.
     */
    public FinalColony()
    {
        familyGroupSurvivalRate = 0.0;
        penguinSurvivalRate = 0.0;
        eggSurvivalRate = 0.0;
        chickSurvivalRate = 0.0;
        overallColonySurvival = 0.0;
    }

    /**
     * Constructor to create the object of class FinalColony with specified survival rates.
     *
     * @param familyGroupSurvivalRate The family group survival rate.
     * @param penguinSurvivalRate     The penguin survival rate.
     * @param eggSurvivalRate         The egg survival rate.
     * @param chickSurvivalRate       The chick survival rate.
     * @param overallColonySurvival   The overall colony survival rate.
     */
    public FinalColony(double familyGroupSurvivalRate, double penguinSurvivalRate, double eggSurvivalRate, double chickSurvivalRate, double overallColonySurvival)
    {
        this.familyGroupSurvivalRate = familyGroupSurvivalRate;
        this.penguinSurvivalRate = penguinSurvivalRate;
        this.eggSurvivalRate = eggSurvivalRate;
        this.chickSurvivalRate = chickSurvivalRate;
        this.overallColonySurvival = overallColonySurvival;
    }

    /**
     * Displays the final colony status with survival rates.
     */
    public void displayFinalColonyStatus()
    {
        System.out.println("Colony survival rates:");
        System.out.println("  * Family Group Survival Rate: " + familyGroupSurvivalRate + "%");
        System.out.println("  * Penguin Survival Rate: " + penguinSurvivalRate + "%");
        System.out.println("  * Egg Survival Rate: " + eggSurvivalRate + "%");
        System.out.println("  * Chick Survival Rate: " + chickSurvivalRate + "%");
        System.out.println("  * Overall Colony Survival: " + overallColonySurvival);
    }

    /**
     * Gets the chick survival rate.
     *
     * @return The chick survival rate.
     */
    public double getChickSurvivalRate()
    {
        return chickSurvivalRate;
    }

    /**
     * Gets the egg survival rate.
     *
     * @return The egg survival rate.
     */
    public double getEggSurvivalRate()
    {
        return eggSurvivalRate;
    }

    /**
     * Gets the family group survival rate.
     *
     * @return The family group survival rate.
     */
    public double getFamilyGroupSurvivalRate()
    {
        return familyGroupSurvivalRate;
    }

    /**
     * Gets the overall colony survival rate.
     *
     * @return The overall colony survival rate.
     */
    public double getOverallColonySurvival()
    {
        return overallColonySurvival;
    }

    /**
     * Gets the penguin survival rate.
     *
     * @return The penguin survival rate.
     */
    public double getPenguinSurvivalRate()
    {
        return penguinSurvivalRate;
    }

    /**
     * Sets the chick survival rate.
     *
     * @param chickSurvivalRate The chick survival rate to set.
     */
    public void setChickSurvivalRate(double chickSurvivalRate)
    {
        this.chickSurvivalRate = chickSurvivalRate;
    }

    /**
     * Sets the egg survival rate.
     *
     * @param eggSurvivalRate The egg survival rate to set.
     */
    public void setEggSurvivalRate(double eggSurvivalRate)
    {
        this.eggSurvivalRate = eggSurvivalRate;
    }

    /**
     * Sets the family group survival rate.
     *
     * @param familyGroupSurvivalRate The family group survival rate to set.
     */
    public void setFamilyGroupSurvivalRate(double familyGroupSurvivalRate)
    {
        this.familyGroupSurvivalRate = familyGroupSurvivalRate;
    }

    /**
     * Sets the overall colony survival rate.
     *
     * @param overallColonySurvival The overall colony survival rate to set.
     */
    public void setOverallColonySurvival(double overallColonySurvival)
    {
        this.overallColonySurvival = overallColonySurvival;
    }

    /**
     * Sets the penguin survival rate.
     *
     * @param penguinSurvivalRate The penguin survival rate to set.
     */
    public void setPenguinSurvivalRate(double penguinSurvivalRate)
    {
        this.penguinSurvivalRate = penguinSurvivalRate;
    }
}




