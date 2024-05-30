import java.util.ArrayList;
import java.util.Random;

/**
 * Store details of the penguin family.
 *
 * @author Hanlu Shi
 * @version ver 1.2
 */
public class PenguinFamily
{
    public  ArrayList<Chick> familyChicks;
    public  ArrayList<Egg> familyEggs;
    private Penguin femalePenguin;
    private String idCode;
    private Penguin malePenguin;

    /**
     * Parameterised constructor which creates the object of class PenguinFamily
     */
    public PenguinFamily()
    {
        familyChicks = new ArrayList<Chick>();
        familyEggs = new ArrayList<Egg>();
        femalePenguin = new Penguin();
        idCode = "";
        malePenguin = new Penguin();
    }

    /**
     * Non-parameterised constructor to create the object of class PenguinFamily
     *
     * @param familyChicks  The arraylist of the chicks of the family
     * @param familyEggs    The arraylist of the eggs of the family
     * @param femalePenguin The female penguin object
     * @param idCode        The unique identification code of the penguin family
     * @param malePenguin   The male penguin object
     */
    public PenguinFamily(ArrayList<Chick> familyChicks, ArrayList<Egg> familyEggs, Penguin femalePenguin, String idCode, Penguin malePenguin)
    {
        this.familyChicks = familyChicks;
        this.familyEggs = familyEggs;
        this.femalePenguin = new Penguin();
        this.idCode = idCode;
        this.malePenguin = new Penguin();
    }

    public int breedEggsAndAlive()
    {
        if (malePenguin.aliveFlag && femalePenguin.aliveFlag)
        {
            Random random = new Random();
            int numberOfNewEggs = random.nextInt(3); // Generate a random number between 0-2
            for (int i = 0; i < numberOfNewEggs; i++)
            {
                Egg egg = new Egg(); //Create an egg
                familyEggs.add(egg);
            }
            return numberOfNewEggs;
        }
        else if (!malePenguin.aliveFlag && !femalePenguin.aliveFlag)
        {
            familyChicks.stream().forEach(chick ->
            {
                chick.setAliveFlag(false);
            });
            familyEggs.stream().forEach(egg ->
            {
                egg.setAliveFlag(false);
            });
            return 0;
        }
        else
        {
            return 0;
        }
    }

    /**
     * Display the details of each chick in the family.
     */
    public void display()
    {
        System.out.println("Family ID: " + idCode);

        System.out.println("\nMale Penguin Details:");
        malePenguin.display();

        System.out.println("\nFemale Penguin Details:");
        femalePenguin.display();

        System.out.println("\nNumber of Chicks: " + familyChicks.size());
        for (int i = 0; i < familyChicks.size(); i++)
        {
            System.out.println("Chick " + (i + 1) + " Details:");
            familyChicks.get(i).display();
        }

        System.out.println("\nNumber of Eggs: " + familyEggs.size());
        for (int i = 0; i < familyEggs.size(); i++)
        {
            System.out.println("Egg " + (i + 1) + " Details:");
            familyEggs.get(i).display();
        }
    }

    /**
     * @return The list of the chicks in the family.
     */
    protected ArrayList<Chick> getFamilyChicks()
    {
        return familyChicks;
    }

    /**
     * @return The list of the eggs in the family.
     */
    protected ArrayList<Egg> getFamilyEggs()
    {
        return familyEggs;
    }

    /**
     * @return The female penguin in the family.
     */
    protected Penguin getFemalePenguin()
    {
        return this.femalePenguin;
    }

    /**
     * @return The ID code of the family.
     */
    public String getIdCode()
    {
        return this.idCode;
    }

    /**
     * @return The male penguin of the family.
     */
    public Penguin getMalePenguin()
    {
        return this.malePenguin;
    }

    /**
     * Set a new list of the chicks
     *
     * @param familyChicks The new list of chicks for the family.
     */
    protected void setFamilyChicks(ArrayList<Chick> familyChicks)
    {
        this.familyChicks = familyChicks;
    }

    /**
     * Set a new list of the eggs
     *
     * @param familyEggs The new list of eggs for the family.
     */
    protected void setFamilyEggs(ArrayList<Egg> familyEggs)
    {
        this.familyEggs = familyEggs;
    }

    /**
     * Set a new female penguin
     *
     * @param femalePenguin The new female penguin of the family.
     */
    protected void setFemalePenguin(Penguin femalePenguin)
    {
        this.femalePenguin = femalePenguin;
    }

    /**
     * Set a unique code for the family
     *
     * @param idCode The new ID code for the penguin famil
     */
    public void setIdCode(String idCode)
    {
        this.idCode = idCode;
    }

    /**
     * Set a new male penguin
     *
     * @param malePenguin The new male penguin of the family.
     */
    protected void setMalePenguin(Penguin malePenguin)
    {
        this.malePenguin = malePenguin;
    }
}


