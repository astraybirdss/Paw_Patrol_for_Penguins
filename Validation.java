/**
 * Provide validation methods.
 *
 * @author Hanlu Shi
 * @version v3.3
 */

public class Validation
{
    /**
     * Default constructor to create the object of class Validation
     */
    public Validation()
    {

    }

    /**
     * Check if the value is a string contains number.
     *
     * @param value String to check
     * @return true if string only contains characters, false otherwise
     */
    public static boolean isNumber(Object value)
    {
        if (value instanceof Integer)
        {
            return true;
        }
        return false;
    }

    /**
     * Check if the length of value valid in length.
     *
     * @param temp String to check
     * @param minLength  Minimum length
     * @param maxLength  Maximum length
     * @return true if string between min and max, false otherwise
     */
    public static boolean isLengthInRange(int temp, int minLength, int maxLength)
    {
        String strTemp = String.valueOf(temp);
        int length = strTemp.length();

        return length >= minLength && length <= maxLength;
    }

    /**
     * Check if the length of value valid in length.
     *
     * @param temp String to check
     * @param min  Minimum length
     * @param max  Maximum length
     * @return true if string between min and max, false otherwise
     */
    public static boolean isNumberInRange(int temp, int min, int max)
    {
        if (temp >= min && temp <= max)
            return true;
        return false;
    }
}
