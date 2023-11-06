import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private List<Book> books;
    public BookStore(){
        this.books= new ArrayList<>();
    }
    public BookStore(ArrayList<Book> books) {
        this.books = books;
    }
    public void add(Book book) {
        books.add(book);
    }
    public void sell(Book book) {
        int available = book.getAvailable();
        book.setAvailable(available - 1);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

}
