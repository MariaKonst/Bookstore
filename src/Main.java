import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookStore store = new BookStore();

        Scanner sc = new Scanner(System.in);
        int numOfBooks = sc.nextInt();
        for (int i = 0; i < numOfBooks; i++) {
            Book book1 = new Book();
            System.out.println("Въведете данни за книга <тип-Comic_book/Children_book> <заглавие> <автор> <брой налични> <цена>");
            BookType type = BookType.valueOf(sc.next().toUpperCase());
            switch (type) {
                case CHILDREN_BOOK:book1 = new ChildrenBook();
                case COMIC_BOOK:book1 = new ComicBook();
            }
           book1.setTitle(sc.next());
            book1.setAvailable(sc.nextInt());
            book1.setPrice(sc.nextDouble());
            store.add(book1);


        }


    }
}







