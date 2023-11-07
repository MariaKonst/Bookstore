import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookStore store = new BookStore();
        List<Book> bookList = store.getBooks();
        Scanner sc = new Scanner(System.in);
        int numOfBooks = sc.nextInt();
        for (int i = 0; i < numOfBooks; i++) {
            Book book1 = new Book();
            System.out.println("Въведете данни за книга <тип-COMIC_BOOK/CHILDREN_BOOK/BOOK> <заглавие> <автор> <брой налични> <цена>");
            BookType type = BookType.valueOf(sc.next().toUpperCase());
            switch (type) {
                case CHILDREN_BOOK:book1 = new ChildrenBook();
                case COMIC_BOOK:book1 = new ComicBook();
                case BOOK: book1 = new Book();
            }
            book1.setType(type);
            book1.setTitle(sc.next());
            Author a = new Author();
            a.setAuthorName(sc.next());
            book1.setAuthor(a);
            book1.setAvailable(sc.nextInt());
            book1.setPrice(sc.nextDouble());
            bookList.add(book1);


        }
        sc.close();


        for (Book b:bookList){
            System.out.println(b.getTitle());
        }
    }
}







