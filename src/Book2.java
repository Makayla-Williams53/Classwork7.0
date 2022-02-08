//************************************************************
// Book2.java       Author: Lewis/Loftus/Cocking
//
//Represents a book. Used as the parent of a derived class to
//demonstrate inheritance and the use of the super reference.
//************************************************************
public class Book2
{
    public int pages;
    //-------------------------------------------------------
    // Sets up the book with the specific number of pages.
    //-------------------------------------------------------
    public Book2(int numPages)
    {
        pages = numPages;
    }
    //------------------------------------------------------
    // Prints a message about hte pages of this book.
    //------------------------------------------------------
    public void pageMessage()
    {
        System.out.println("Number of pages: " + pages);
    }
}
