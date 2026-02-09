public class Book {
    private String title;
    public static int bookCount;

    public Book(String title) {
        this.title = title;
        bookCount++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static int getBookCount() {
        return bookCount;
    }

    public static void setBookCount(int bookCount) {
        Book.bookCount = bookCount;
    }

    public static int getAllBooks(){
        return bookCount++;
    }

    @Override
    public String toString() {
        return "Title=" + title;
    }
}
