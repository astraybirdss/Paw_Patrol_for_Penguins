import java.io.IOException;

/**
 * The main class for the Paw Patrol simulation.
 *
 * @author Hanlu Shi
 * @version ver 1.1
 */
public class PenguinPawPatrol
{
    private int numberOfDogs;

    public PenguinPawPatrol()
    {
        // Default constructor
    }

    /**
    * Displays the details of the PenguinPawPatrol.
    */
    public void display()
    {
        System.out.println("\nPenguinPawPatrol [numberOfDogs=" + numberOfDogs + "]");
    }

    /**
    * Retrieves the number of dogs for the PenguinPawPatrol.
    *
    * @return The number of dogs.
    */
    public int getNumberOfDogs()
    {
        return numberOfDogs;
    }

    /**
    * Prompts the user to input the number of patrol dogs for the PenguinPawPatrol.
    * Validates the input and returns the number of dogs.
    *
    * @return The number of patrol dogs (0-2).
    */
    public static int numberOfDogs()
    {
        while (true)
        {
            int numberOfDogs = Input.acceptNumberInput("How many patrol dogs? (0-2)\n");

            if (!Validation.isLengthInRange(numberOfDogs, 1, 1))
            {
                System.out.println("\nError: length is not in range");
                continue;
            } else if (!Validation.isNumberInRange(numberOfDogs, 0, 2))
            {
                System.out.println("\nError: number is not in range");
                continue;
            }
            else
            {
                System.out.println("=====================");
                switch (numberOfDogs)
                {
                    case 0:
                        System.out.println("\n  Number of Dogs: 0\n");
                        break;
                    case 1:
                        System.out.println("\n  Number of Dogs: 1\n");
                        break;
                    case 2:
                        System.out.println("\n  Number of Dogs: 2\n");
                        break;
                }
            }
            return numberOfDogs;
        }
    }

    /**
    * Sets the number of dogs for the PenguinPawPatrol.
    *
    * @param numberOfDogs The number of dogs to set.
    */
    public void setNumberOfDogs(int numberOfDogs)
    {
        this.numberOfDogs = numberOfDogs;
    }

    /**
     * The entry point of the Paw Patrol simulation.
     *
     * @param args The command-line arguments.
     * @throws IOException If an I/O error occurs.
     */
    public static void main(String[] args) throws IOException
    {
        System.out.println("Welcome to Paw Patrol");
        System.out.println("=====================");

        // Create an instance of PenguinPawPatrol
        Simulation simulation = FileIO.readFile(numberOfDogs());

        // Run the simulation
        simulation.run();
    }
}
