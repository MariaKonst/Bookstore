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
        if(available>0) {
            book.setAvailable(available - 1);
            System.out.println("Продаваме книгата със заглавие " + "'" + book.getTitle() + "'" + ". " );
            System.out.println(book.getPrice());

        } else {
            System.out.println("Няма налични бройки!");
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

}
