import java.util.Dictionary;

//*************************************************************************
// Words2.java      Author: Lewis/Loftus/Cocking
//
// Demonstrates the use of the super reference
//*************************************************************************
public class Words2
{
    //---------------------------------------------------------------------
    // Instantiates a derived class and invokes it inherited and
    // local methods.
    //---------------------------------------------------------------------
    public static void main (String[] args)
    {
        Dictionary2 webster = new Dictionary2(1500, 52500);
        webster.pageMessage();
        webster.definitionMessage();
        System.out.println("\nMakayla Williams");
        System.out.println("Classwork 7.0");
    }

}


