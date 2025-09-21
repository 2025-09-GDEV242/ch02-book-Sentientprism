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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }

    public String printAuthor(String author)
    {
        System.out.print(author);
        return author;
    }
    
    public String printTitle(String title)
    {
        System.out.print(title);
        return title;
    }
    
    public int printPages(int pages)
    {
        System.out.print(pages);
        return pages;
    }
    
}
