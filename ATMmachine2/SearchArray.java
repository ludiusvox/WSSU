package ATMmachine2;

public class SearchArray
{
    /**
     * The seuqntialSearch method searches array for value.  If value is found in array, the element's subscript
     * is returned.  Otherwise, -1 is returned
     */
public static int sequentialSearch(int[] array, int value)
{ 
    int index, //loop control variable
        element;
    boolean found;
    
    index = 0;
    
    element = -1;
    found = false;
    
    while (!found && index < array.length)
    {
        if (array[index] == value)
        {
            found = true;
            element = index;
        }
        index ++;}
        return element;}}
   