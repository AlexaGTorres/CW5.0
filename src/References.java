public class References
{
    public static void main (String[] args)
    {
        System.out.println ("Alexa Torres Classwork 5.0");
        System.out.println ();

        Num n1 = new Num (56);
        Num n2 = new Num (57);

        Integer i1 = new Integer (23);
        Integer i2 = new Integer (24);

        System.out.println ("n1: " + n1);
        System.out.println ("n2: " + n2);

        System.out.println ("i1: " + i1);
        System.out.println ("i2: " + i2);
        System.out.println();

        n1 = n2;
        i1 = i2;

        System.out.println ("n1: " + n1);
        System.out.println ("n2: " + n2);

        System.out.println ("i1: " + i1);
        System.out.println ("i2: " + i2);
        System.out.println();

        n1.setValue(n1.getValue() + 1);
        i1++;

        System.out.println ("n1: " + n1);
        System.out.println ("n2: " + n2);

        System.out.println ("i1: " + i1);
        System.out.println ("i2: " + i2);
        System.out.println();
    }//End main method
}//End class References
