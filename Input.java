/**
 * Store details of the input.
 *
 * @author Hanlu Shi
 * @version v3.1
 */
import java.util.*;

public class Input
{
    private int number;

    /**
     * Default constructor.
     */
    public Input()
    {
    }

    /**
     * Non-default constructor.
     *
     * @param number The initial value for the number field.
     */
    public Input(int number)
    {
        this.number = number;
    }

    /**
     * Getter for the number field.
     *
     * @return The value of the number field.
     */
    public int getNumber()
    {
        return number;
    }

    /**
     * Setter for the number field.
     *
     * @param number The new value for the number field.
     */
    public void setNumber(int number)
    {
        this.number = number;
    }

    /**
     * Display the number field as a string.
     *
     * @return The string representation of the number field.
     */
    @Override
    public String toString()
    {
        return "\nInput [number=" + number + "]";
    }

    /**
     * Get an integer input from the user.
     *
     * @param displayMessage The message to display to prompt user input as a string.
     * @return The integer entered by the user.
     */
    public static int acceptNumberInput(String displayMessage)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(displayMessage);

        while (true)
        {
            try
            {
                String input = scanner.nextLine();
                return Integer.parseInt(input);
            }
            catch (NumberFormatException e)
            {
                System.out.print("\nInvalid input. Please enter a valid integer.\n");
            }
        }
    }
}
