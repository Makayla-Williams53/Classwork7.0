//*************************************************************
//Dictionary2.java      Author: Lewis/Loftus/Cocking
//
//Represents a dictionary, which is a book. Used to demonstrate
//the use of the super reference.
//**************************************************************
public class Dictionary2 extends Book2
{
    private int defintions;
    //---------------------------------------------------------
    //Sets up the dictionary with the specified number of pages
    //(maintained by the Book parent class) and definitions.
    //---------------------------------------------------------
    public Dictionary2 (int numPages, int numDefinitions)
    {
        super(numPages);
        defintions = numDefinitions;
    }
    //----------------------------------------------------------
    // Prints a message using both local and inherited values.
    //----------------------------------------------------------
    public void definitionMessage()
    {
        System.out.println("Number of definitions: " + defintions);
        System.out.println("Definitions per page: " + defintions/pages);
    }
}
