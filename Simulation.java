import java.io.IOException;
import java.util.*;

/**
 * Store details of the simulation process.
 *
 * @author Hanlu Shi
 * @version ver 1.2
 */
public class Simulation
{
    private int catCount;
    private int catKilled;
    private List<Cat> cats;
    private int chicksKilled;
    private int completeFamilyNum;
    private List<Dog> dogs;
    private int eggsEaten;
    private int femalePenguinsKilled;
    private int foxCount;
    private int foxKilled;
    private List<Fox> foxes;
    private int liveChicks;
    private int liveEggs;
    private int livePenguins;
    private int malePenguinKilled;
    private int month;
    private int newChicks;
    private int newEggs;
    private List<PenguinFamily> penguinFamilies;
    private List<Shark> sharks;


    /**
     * Default constructor.
     * Initializes all fields to their default values.
     */
    public Simulation()
    {
        this.catCount = 0;
        this.catKilled = 0;
        cats = new ArrayList<>();
        this.chicksKilled = 0;
        this.completeFamilyNum = 0;
        dogs = new ArrayList<>();
        this.eggsEaten = 0;
        this.femalePenguinsKilled = 0;
        this.foxCount = 0;
        this.foxKilled = 0;
        foxes = new ArrayList<>();
        this.liveChicks = 0;
        this.liveEggs = 0;
        this.livePenguins = 0;
        this.malePenguinKilled = 0;
        this.month = 0;
        this.newChicks = 0;
        this.newEggs = 0;
        penguinFamilies = new ArrayList<>();
        sharks = new ArrayList<>();
    }

    /**
     * Non-default constructor.
     *
     * @param catCount                The current count of cats.
     * @param catKilled               The number of cats killed in the month.
     * @param cats                    The list of cats.
     * @param chicksKilled            The number of chicks killed in the month.
     * @param completeFamilyNum       The number of complete penguin families.
     * @param dogs                    The list of dogs.
     * @param eggsEaten               The number of eggs eaten in the month.
     * @param femalePenguinsKilled    The number of female penguins killed in the month.
     * @param foxCount                The current count of foxes.
     * @param foxKilled               The number of foxes killed in the month.
     * @param foxes                   The list of foxes.
     * @param liveChicks              The number of live chicks.
     * @param liveEggs                The number of live eggs.
     * @param livePenguins            The number of live penguins.
     * @param malePenguinKilled       The number of male penguins killed in the month.
     * @param month                   The month of the statistics.
     * @param newChicks               The number of new chicks in the month.
     * @param newEggs                 The number of new eggs in the month.
     * @param penguinFamilies         The list of penguin families.
     * @param sharks                  The list of sharks.
     */
    public Simulation(int catCount, int catKilled, List<Cat> cats, int chicksKilled, 
    int completeFamilyNum, List<Dog> dogs, int eggsEaten, 
    int femalePenguinsKilled, int foxCount, int foxKilled, 
    List<Fox> foxes, int liveChicks, int liveEggs, int livePenguins, 
    int malePenguinKilled, int month, int newChicks, int newEggs, 
    List<PenguinFamily> penguinFamilies, List<Shark> sharks)
    {
        this.catCount= catCount;
        this.catKilled =catKilled;
        this.cats = cats;
        this.chicksKilled =chicksKilled;
        this.completeFamilyNum = completeFamilyNum;
        this.dogs = dogs;
        this.eggsEaten =eggsEaten;
        this.femalePenguinsKilled = femalePenguinsKilled;
        this.foxCount = foxCount;
        this.foxKilled = foxKilled;
        this.foxes = foxes;
        this.liveChicks = liveChicks;
        this.liveEggs =liveEggs;
        this.livePenguins = livePenguins;
        this.malePenguinKilled = malePenguinKilled;
        this.month = month;
        this.newChicks = newChicks;
        this.newEggs = newEggs;
        this.penguinFamilies = penguinFamilies;
        this.sharks = sharks;
    }

    /**
     * Non-default constructor.
     *
     * @param cats            The list of cats.
     * @param foxes           The list of foxes.
     * @param penguinFamilies The list of penguin families.
     * @param sharks          The list of sharks.
     * @param dogs            The list of dogs.
     */
    public Simulation(List<Cat> cats, List<Fox> foxes, List<PenguinFamily> penguinFamilies, List<Shark> sharks, List<Dog> dogs) {
        this.cats = cats;
        this.foxes = foxes;
        this.penguinFamilies = penguinFamilies;
        this.sharks = sharks;
        this.dogs = dogs;
    }

    /**
     * Method to clear simulation.
     */
    public void clear()
    {
        Predator.toClear();
    }

    private void countKill(KillCount killCount)
    {
        Optional.ofNullable(killCount).ifPresent(v->
        {
            femalePenguinsKilled = v.getFemalePenguins();
            malePenguinKilled = v.getMalePenguins();
            chicksKilled = v.getChicks();
            eggsEaten = v.getEggs();
        }) ;
    }

    /**
     * Method to display simulation results.
     */
    public void display()
    {
        // Initialize the variables for display
        completeFamilyNum = 0;
        livePenguins = 0;
        liveChicks = 0;
        liveEggs = 0;
        // Count the number in penguin families
        for (PenguinFamily family : penguinFamilies)
        {
            if (family.getMalePenguin().getAliveFlag() && family.getFemalePenguin().getAliveFlag())
            {
                completeFamilyNum++;  // complete family number
            }
            if (family.getMalePenguin().getAliveFlag())
            {
                livePenguins++;  // live male Penguins
            }
            if (family.getFemalePenguin().getAliveFlag())
            {
                livePenguins++;  // live female Penguins
            }
            for (Chick chick : family.getFamilyChicks()) {
                if (chick.getAliveFlag())
                {
                    liveChicks++;  // live chicks 
                }
            }
            for (Egg egg: family.getFamilyEggs())
            {
                if (egg.getAliveFlag())
                {
                    liveEggs++;  // uneaten eggs
                }
            }
        }

        // Display the monthly simulation
        System.out.println("+ new chicks: " + newChicks);
        System.out.println("+ new eggs: " + newEggs);
        System.out.println("- penguin killed: " + malePenguinKilled + " male " + femalePenguinsKilled + " female");
        System.out.println("- chicks killed: " + chicksKilled);
        System.out.println("- eggs eaten: " + eggsEaten);
        System.out.println("- fox killed: " + foxKilled);
        System.out.println("- cat killed: " + catKilled);
        System.out.println("\nEnd of month colony status:");
        System.out.println("  Number of complete family groups: " + completeFamilyNum);
        System.out.println("  Number of live chicks: " + liveChicks);
        System.out.println("  Number of live eggs: " + liveEggs);
        System.out.println("  Number of live penguins: " + livePenguins);
        System.out.println("  Number of live fox: " + foxCount);
        System.out.println("  Number of live cat: " + catCount);
        System.out.println("  Number of live shark: " + sharks.size());
        System.out.println("======================================\n");
        System.out.println("press Enter to continue: "); //Wait for user input to continue
        Scanner scanner = new Scanner(System.in);
        String next = scanner.nextLine();
        if (month != 6)
        {
            emptyData();
        }
    }

    /**
     * Method to empty simulation data.
     */
    private void emptyData()
    {
        newChicks = 0;
        newEggs = 0;
        malePenguinKilled = 0;
        femalePenguinsKilled = 0;
        chicksKilled = 0;
        eggsEaten = 0;
        foxKilled = 0;
        catKilled = 0;
        completeFamilyNum = 0;
        liveChicks = 0;
        livePenguins = 0;
        foxCount = 0;
        catCount = 0;

    }

    /**
     * Gets the current count of cats.
     *
     * @return The current count of cats.
     */
     public int getCatCount()
     {
        return catCount;
     }

     /**
     * Gets the number of cats killed in the month.
     *
     * @return The number of cats killed in the month.
     */
     public int getCatKilled()
     {
        return catKilled;
     }

    /**
     * Method to get a list of cats.
     */
    public List<Cat> getCats()
    {
        return cats;
    }

    /**
     * Gets the number of chicks killed in the month.
     *
     * @return The number of chicks killed in the month.
     */
     public int getChicksKilled()
     {
        return chicksKilled;
     }

    /**
     * Method to get a number of complete family.
     */
    public int getCompleteFamilyNum()
    {
        return completeFamilyNum;
    }

    /**
     * Method to get a list of dogs.
     */
    public List<Dog> getDogs()
    {
        return dogs;
    }

    /**
    * Gets the number of eggs eaten in the month.
    *
    * @return The number of eggs eaten in the month.
    */
    public int getEggsEaten()
    {
        return eggsEaten;
    }

    /**
    * Gets the number of female penguins killed in the month.
    *
    * @return The number of female penguins killed in the month.
    */
    public int getFemalePenguinsKilled()
    {
        return femalePenguinsKilled;
    }

    /**
    * Gets the current count of foxes.
    *
    * @return The current count of foxes.
    */
    public int getFoxCount()
    {
        return foxCount;
    }

    /**
    * Gets the number of foxes killed in the month.
    *
    * @return The number of foxes killed in the month.
    */
    public int getFoxKilled()
    {
        return foxKilled;
    }

    /**
     * Method to get a list of foxes.
     */
    public List<Fox> getFoxes()
    {
        return foxes;
    }

    /**
     * Method to get a number of live chicks.
     */
    public int getLiveChicks()
    {
        return liveChicks;
    }

    /**
     * Method to get a number of live penguins.
     */
    public int getLivePenguins()
    {
        return livePenguins;
    }

    /**
    * Gets the number of male penguins killed in the month.
    *
    * @return The number of male penguins killed in the month.
    */
    public int getMalePenguinKilled()
    {
        return malePenguinKilled;
    }

    /**
    * Gets the month of the statistics.
    *
    * @return The month of the statistics.
    */
    public int getMonth()
    {
        return month;
    }

    /**
    * Gets the number of new chicks in the month.
    *
    * @return The number of new chicks in the month.
    */
    public int getNewChicks()
    {
        return newChicks;
    }

    /**
    * Gets the number of new eggs in the month.
    *
    * @return The number of new eggs in the month.
    */
    public int getNewEggs()
    {
        return newEggs;
    }

    /**
     * Method to get a list of penguin families.
     */
    public List<PenguinFamily> getPenguinFamilies()
    {
        return penguinFamilies;
    }

    /**
     * Method to get a list of sharks.
     */
    public List<Shark> getSharks()
    {
        return sharks;
    }

    /**
     * method to hatch eggs for penguin families.
     */
    public void hatchEggsForPenguinFamilies()
    {
        for (PenguinFamily family : penguinFamilies)
        {
            List<Egg> eggs = family.getFamilyEggs();

            for (Egg egg : eggs)
            {
                if (egg.hatch(family))
                {
                    newChicks++;
                }
            }
        }
    }

    /**
     * method to kill cats and foxes.
     */
    public void killCatsAndFoxes()
    {
        Random random = new Random();
        for (Cat cat : cats)
        {
            if (cat.getAliveFlag())
            {
                double dogProtectProbability = Dog.getKillProbability(dogs.size());
                double catKilledProbability = random.nextDouble();
                if (dogProtectProbability >= catKilledProbability)
                {

                    cat.setAliveFlag(false);
                    catKilled++;
                }
            }
            // Update cates after killed
            if (cat.getAliveFlag())
            {
                catCount++;
            }
        }

        for (Fox fox : foxes)
        {
            if (fox.getAliveFlag())
            {
                double dogProtectProbability = Dog.getKillProbability(dogs.size());
                double foxkilledProbality = random.nextDouble();
                if (dogProtectProbability >= foxkilledProbality)
                {

                    fox.setAliveFlag(false);
                    foxKilled++;
                }
            }
            // Update fox after killed
            if (fox.getAliveFlag())
            {
                foxCount++;
            }
        }
    }

    /**
     * method to lay eggs for penguin families.
     */
    public void layEggsForPenguinFamilies()
    {
        for (PenguinFamily family : penguinFamilies)
        {
            int eggsAdd = family.breedEggsAndAlive();
            newEggs += eggsAdd;
        }
    }

    /**
     * method for predator attack simulation.
     */
    public void predatorAttack()
    {
        Random random = new Random();
        KillCount catKillCount = null;
        KillCount foxKillCount = null;
        KillCount sharkKillCount = null;

        if (Cat.hasAlive(cats))
        {
            catKillCount = cats.get(0).toHunt(penguinFamilies,dogs.size());
        }

        if (Fox.hasAlive(foxes))
        {
            foxKillCount = foxes.get(0).toHunt(penguinFamilies,dogs.size());
        }

        if (Shark.hasAlive(sharks))
        {
            sharkKillCount = sharks.get(0).toHunt(penguinFamilies,dogs.size());
        }

        countKill(catKillCount);
        countKill(foxKillCount);
        countKill(sharkKillCount);
    }

    /**
     * Method to run the simulation 12 months.
     */
    public void run() throws IOException
    {
        int result = 7;
        int endMonth = 6;
        int currentMonth = result;
        do {
            runPerMonth(currentMonth);
            result++;
            if (result % 12 == 0)
            {
                currentMonth = 12;
            } else {
                currentMonth = result % 12;
            }
        } while (currentMonth != endMonth);
        runPerMonth(endMonth);

        double familyGroupSurvivalRate = 100 * ((double) completeFamilyNum / (double) penguinFamilies.size());
        double penguinSurvivalRate = 100 * ((double) livePenguins / ((double) penguinFamilies.size() * 2.0));
        int hatchedEggCount = 0;
        int allEggNum = 0;

        statisticsAnimal(familyGroupSurvivalRate, penguinSurvivalRate, hatchedEggCount, allEggNum);


    }

    /**
     * Method to run the simulation per month.
     */
    public void runPerMonth(int month)
    {
        System.out.println("=====================");
        this.month = month;
        System.out.println("\nSimulating month: " + month);
        // 1 hatch Eggs For PenguinFamilies
        hatchEggsForPenguinFamilies();
        // 2 Lay Eggs For PenguinFamilies
        layEggsForPenguinFamilies();
        // 3 Kill Cats And Foxes by dogs
        killCatsAndFoxes();
        // 4 All predators including cata, sharks and fox attack
        predatorAttack();
        // 5 Display the simulation for each month after each simulation
        display();
        // 6 Clear the simulation counting temp for each month
        clear();
    }

    /**
     * Sets the list of cats.
     *
     * @param cats The list of cats to set.
     */
    public void setCats(List<Cat> cats)
    {
        this.cats = cats;
    }

    /**
     * Sets the number of complete families.
     *
     * @param completeFamilyNum The number of complete families to set.
     */
    public void setCompleteFamilyNum(int completeFamilyNum)
    {
        this.completeFamilyNum = completeFamilyNum;
    }

    /**
     * Sets the list of dogs.
     *
     * @param dogs The list of dogs to set.
     */
    public void setDogs(List<Dog> dogs)
    {
        this.dogs = dogs;
    }

    /**
    * Sets the number of eggs eaten in the month.
    *
    * @param eggsEaten The number of eggs eaten to set.
    */
    public void setEggsEaten(int eggsEaten)
    {
        this.eggsEaten = eggsEaten;
    }

    /**
    * Sets the number of female penguins killed in the month.
    *
    * @param femalePenguinsKilled The number of female penguins killed to set.
    */
    public void setFemalePenguinsKilled(int femalePenguinsKilled)
    {
        this.femalePenguinsKilled = femalePenguinsKilled;
    }

    /**
    * Sets the count of foxes.
    *
    * @param foxCount The count of foxes to set.
    */
    public void setFoxCount(int foxCount)
    {
        this.foxCount = foxCount;
    }

    /**
    * Sets the number of foxes killed in the month.
    *
    * @param foxKilled The number of foxes killed to set.
    */
    public void setFoxKilled(int foxKilled)
    {
        this.foxKilled = foxKilled;
    }

    /**
     * Sets the list of foxes.
     *
     * @param foxes The list of foxes to set.
     */
    public void setFoxes(List<Fox> foxes)
    {
        this.foxes = foxes;
    }

    /**
    * Sets the number of live chicks.
    *
    * @param liveChicks The number of live chicks to set.
    */
    public void setLiveChicks(int liveChicks)
    {
        this.liveChicks = liveChicks;
    }

    /**
    * Sets the number of live eggs.
    *
    * @param liveEggs The number of live eggs to set.
    */
    public void setLiveEggs(int liveEggs)
    {
        this.liveEggs = liveEggs;
    }

    /**
    * Sets the number of live penguins.
    *
    * @param livePenguins The number of live penguins to set.
    */
    public void setLivePenguins(int livePenguins)
    {
        this.livePenguins = livePenguins;
    }

    /**
    * Sets the number of male penguins killed in the month.
    *
    * @param malePenguinKilled The number of male penguins killed to set.
    */
    public void setMalePenguinKilled(int malePenguinKilled)
    {
        this.malePenguinKilled = malePenguinKilled;
    }

    /**
     * Sets the month.
     *
     * @param month The month to set.
     */

    public void setMonth(int month)
    {
        this.month = month;
    }

    /**
    * Sets the number of new chicks in the month.
    *
    * @param newChicks The number of new chicks to set.
    */
    public void setNewChicks(int newChicks)
    {
        this.newChicks = newChicks;
    }

    /**
    * Sets the number of new eggs in the month.
    *
    * @param newEggs The number of new eggs to set.
    */
    public void setNewEggs(int newEggs)
    {
        this.newEggs = newEggs;
    }

    /**
    * Sets the list of penguin families.
    *
    * @param penguinFamilies The list of penguin families to set.
    */
    public void setPenguinFamilies(List<PenguinFamily> penguinFamilies)
    {
        this.penguinFamilies = penguinFamilies;
    }

    /**
     * Sets the list of sharks.
     *
     * @param sharks The list of sharks to set.
     */
    public void setSharks(List<Shark> sharks)
    {
        this.sharks = sharks;
    }

    /**
     * Calculates and displays various statistics related to the penguin colony.
     * The statistics include family group survival rate, penguin survival rate,
     * egg survival rate, chick survival rate, and overall colony survival rate.
     *
     * @param familyGroupSurvivalRate The survival rate of the penguin families as a percentage.
     * @param penguinSurvivalRate The survival rate of individual penguins as a percentage.
     * @param hatchedEggCount The number of hatched eggs.
     * @param allEggNum The total number of eggs.
     * @throws IOException If an I/O error occurs while writing the statistics to a file.
     */
    private void statisticsAnimal(double familyGroupSurvivalRate, double penguinSurvivalRate, int hatchedEggCount, int allEggNum) throws IOException
    {
        for (PenguinFamily family : penguinFamilies)
        {
            for (Egg egg : family.getFamilyEggs())
            {
                if (egg.getIsHatched())
                {
                    hatchedEggCount += 1;
                }
                allEggNum++;
            }

        }
        double eggSurvivalRate = 100 * ((double) hatchedEggCount / (double) allEggNum);
        double chickSurvivalRate = 0.0;
        if (hatchedEggCount != 0)
        {

            chickSurvivalRate = 100 * ((double) liveChicks / (double) hatchedEggCount);
        }
        double overallColonySurvivalRate = (double) (liveChicks + livePenguins) / ((double) (penguinFamilies.size() * 2));
        String formattedFamilyGroupSurvivalRate = String.format("%.2f", familyGroupSurvivalRate);
        String formattedPenguinSurvivalRate = String.format("%.2f", penguinSurvivalRate);
        String formattedEggSurvivalRate = String.format("%.2f", eggSurvivalRate);
        String formattedChickSurvivalRate = String.format("%.2f", chickSurvivalRate);
        String formattedOverallColonySurvivalRate = String.format("%.2f", overallColonySurvivalRate);

        FinalColony finalColony = new FinalColony(
                Double.parseDouble(formattedFamilyGroupSurvivalRate),
                Double.parseDouble(formattedPenguinSurvivalRate),
                Double.parseDouble(formattedEggSurvivalRate),
                Double.parseDouble(formattedChickSurvivalRate),
                Double.parseDouble(formattedOverallColonySurvivalRate));
        finalColony.displayFinalColonyStatus();
        FileIO.writeToFile(finalColony);
    }

}
