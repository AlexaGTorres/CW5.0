public class Num
{
    private int value;


    public Num (int update)
    {
        value = update;
    }//Sets up the new Num object, storing an initial value

    public int getValue()
    {
        return value;
    }//Return the stored integer value

    public void setValue (int update)
    {
        value = update;
    }//Sets the stored value to the newly specified value

    public String toString ()
    {
        return value + "";
    }//Returns the stored integer value as a string
}//End class Num
