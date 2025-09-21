/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Edmund Dougherty
 * @version 9/20/25
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String details;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
    }

    public void printAuthor()
    {
        System.out.print(author);
    }
    
    public void printTitle()
    {
        System.out.print(title);
    }
    
    public void printPages()
    {
        System.out.print(pages);
    }
    
    public void printDetails()
    {
        details = "Title: " + title + " by: " + author + ". " + pages
         + " pages.";
        System.out.print(details);
    }
    
}
