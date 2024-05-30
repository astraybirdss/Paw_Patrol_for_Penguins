import java.io.*;
import java.util.*;

/**
 * This class handles file input/output operations.
 * It allows reading the content of a file and writing survival rates to a file.
 * The file names are specified as constants.
 * Note: The class assumes the existence of other classes, such as Simulation, PenguinFamily, Fox, Cat, Shark, Dog, Chick, Egg, and Penguin,
 * which are not included in this template.
 * Import statements for those classes are also not included.
 *
 * @author Hanlu Shi
 * @version ver 1.1
 */
public class FileIO {
    public static final String outputFile = "colonyFinal.txt";
    public static final String inputFile = "colony.txt";

    /**
     * Default constructor to create the object of class FileIO
     * Sets inputFile to "colony.txt" and outputFile to "colonyFinal.txt"
     */
    public FileIO()
    {
    }


    private static List<PenguinFamily> getPenguinFamilies(int penguinFamiliesSize)
    {
        List<PenguinFamily> penguinFamilies = new ArrayList<>(penguinFamiliesSize);
        for (int i = 0; i < penguinFamiliesSize; i++)
        {
            ArrayList<Chick> chicks = new ArrayList<>();
            ArrayList<Egg> eggs = new ArrayList<>();
            Penguin femalePenguin = new Penguin('F');
            Penguin malePenguin = new Penguin('M');

            int count = i + 1;
            String idCode = "P" + String.format("%03d", count);
            PenguinFamily family = new PenguinFamily(chicks, eggs, femalePenguin, idCode, malePenguin);
            penguinFamilies.add(family);
        }
        return penguinFamilies;
    }

    /**
    * Retrieves the value of the output file.
    *
    * @return The output file value.
    */
    public static String getOutputFile()
    {
        return outputFile;
    }

    /**
    * Retrieves the value of the input file.
    *
    * @return The input file value.
    */
    public static String getInputFile()
    {
        return inputFile;
    }

    /**
     * This method reads the content of a file.
     * It opens the file, reads its content line by line, splits each line into numbers,
     * and parses these numbers into integers.
     * If the filename is not provided or the file is not found, it prints an error message.
     *
     * @param dogNum The number of dogs.
     * @return A Simulation object created based on the file content.
     * @throws FileNotFoundException if the file is not found
     * @throws IOException           if an I/O error occurs
     */
    public static Simulation readFile(int dogNum) throws FileNotFoundException, IOException
    {
        FileReader fileReader = null;
        Scanner scanner = null;
        Simulation simulation = null;
        //2 Read file
        try
        {
            fileReader = new FileReader(inputFile);
            scanner = new Scanner(fileReader);
            //1 Open file

            while (scanner.hasNextLine())
            {

                //read one line
                String lineContent = scanner.nextLine();
                //split
                String[] numbers = lineContent.split(",");
                int penguinFamiliesSize = Integer.parseInt(numbers[0].trim());
                int foxesSize = Integer.parseInt(numbers[1].trim());
                int catsSize = Integer.parseInt(numbers[2].trim());
                int sharksSize = Integer.parseInt(numbers[3].trim());

                // Initialize the lists with the obtained sizes
                List<PenguinFamily> penguinFamilies = getPenguinFamilies(penguinFamiliesSize);

                List<Fox> foxes = new ArrayList<>(foxesSize);
                for (int i = 0; i < foxesSize; i++)
                {
                    Fox fox = new Fox();
                    foxes.add(fox);
                }

                List<Cat> cats = new ArrayList<>(catsSize);
                for (int i = 0; i < catsSize; i++)
                {
                    Cat cat = new Cat();
                    cats.add(cat);
                }

                List<Shark> sharks = new ArrayList<>(sharksSize);
                for (int i = 0; i < sharksSize; i++)
                {
                    Shark shark = new Shark();
                    sharks.add(shark);
                }

                ArrayList<Dog> dogs = new ArrayList<>(dogNum);
                for (int i = 0; i < dogNum; i++)
                {
                    Dog dog = new Dog();
                    dogs.add(dog);
                }


                simulation = new Simulation(cats, foxes, penguinFamilies, sharks, dogs);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();

        }
        finally
        {

            if (scanner != null)
            {
                scanner.close();
            }
            if (fileReader != null)
            {
                fileReader.close();
            }
        }

        return simulation;
    }

    /**
     * Returns a string representation of the FileIO object.
     *
     * @return A string representation of the FileIO object.
     */
    @Override
    public String toString()
    {
        return "FileIO{" +
                "outputFile='" + outputFile + '\'' +
                ", inputFile='" + inputFile + '\'' +
                '}';
    }

    //3 Close file

    /**
     * This method writes survival rates to a file.
     * It opens the file, writes the survival rates, and then closes the file.
     *
     * @param colony The FinalColony object containing survival rates.
     * @throws FileNotFoundException if the file is not found
     * @throws IOException           if an I/O error occurs
     */
    public static void writeToFile(FinalColony colony) throws FileNotFoundException, IOException
    {
        // 1 Open file
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outputFile));

        // 2 Write file
        try
        {
            System.out.println("\nWriting survival rates into colonyFinal.txt");
            fileWriter.write(String.valueOf(colony.getFamilyGroupSurvivalRate()) + ",");
            fileWriter.write(String.valueOf(colony.getPenguinSurvivalRate()) + ",");
            fileWriter.write(String.valueOf(colony.getEggSurvivalRate()) + ",");
            fileWriter.write(String.valueOf(colony.getChickSurvivalRate()) + ",");
            fileWriter.write(String.valueOf(colony.getOverallColonySurvival()));
        }
        finally
        {
            System.out.println("Goodbye");
            // 3 Close the file
            fileWriter.close();
        }
    }
}
