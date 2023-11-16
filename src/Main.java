import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookStore store = new BookStore();
        List<Book> bookList = store.getBooks();
        Scanner sc = new Scanner(System.in);
        System.out.println("Моля въведете брой книги в книжарницата");
        int numOfBooks = sc.nextInt();
        for (int i = 0; i < numOfBooks; i++) {
            Book book = new Book();
            System.out.println("Въведете данни за книга <тип-COMIC_BOOK/CHILDREN_BOOK/BOOK> <заглавие> <автор> <брой налични> <цена>");
            BookType type = BookType.valueOf(sc.next().toUpperCase());
            switch (type) {
                case CHILDREN_BOOK:book = new ChildrenBook(); break;
                case COMIC_BOOK:book = new ComicBook();break;
                case BOOK: book = new Book();break;
            }
            book.setType(type);
            book.setTitle(sc.next());
            Author a = new Author();
            a.setAuthorName(sc.next());
            book.setAuthor(a);
            book.setAvailable(sc.nextInt());
            book.setPrice(sc.nextDouble());

            switch(type){
                case COMIC_BOOK:
                    System.out.println("Въведете име на герой от книгата. ");
                    ((ComicBook)book).setCharacterName(sc.next());
                    break;

                case  CHILDREN_BOOK:
                    System.out.println("Въведете възрастта на детето, за което е предназначена книгата. ");
                    ((ChildrenBook)book).setAge(sc.nextInt());
                    break;
            }
            bookList.add(book);
        }

        sc.close();

        for (int i=0;i<numOfBooks;i+=2){
            Book book = bookList.get(i);
            store.sell(book);
        }
    }
}







