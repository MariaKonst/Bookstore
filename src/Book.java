public class Book {
    private String title;
    private Author author;
    private BookType type;
    private int available;
    private double originalPrice;
   public  Book(){
        this.title = null;
        this.author = new Author();
        this.type=  BookType.BOOK;
        this.available  =100;
        this.originalPrice = 0;
    }


     Book(String title, Author author, BookType type, int available, double price){
        this.title = title;
        this.author = author;
        this.type = type;
        this.available = available;
        this.originalPrice = price;

    }




    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

   /* public double getPrice() {
        return price;
    }*/

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getOriginalPrice(){

        return originalPrice;
    }
    public double getPrice() {
        System.out.println(this.toString() + "Книгата е продадена  на цена от  " + originalPrice + "лв. ");
        return originalPrice;
    }

    @Override
    public String toString() {
        return "Произведението е написано от " + author + "\n" +
                "Останали налични бройки след покупката: " + available +"\n"+
                "Оригиналната цена е " + originalPrice + "лв."+ "\n"
                ;
    }
}
