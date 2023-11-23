public class ComicBook extends Book{


    private String  characterName;
    public ComicBook(){ }
    public ComicBook(String title, Author author, BookType type, int available, double price, String characterName){
        super(title,author,type, available, price);
        this.characterName=characterName;
    }
    @Override
    public double getPrice(){
        double price = super.getOriginalPrice();
        double discountedPrice = price * 0.4;
        System.out.println(this.toString() +"Книгата е на 60% намаление на нова цена от  " + discountedPrice + " лв.");
        return discountedPrice;
    }

    @Override
    public String toString() {
        return
                super.toString() + "Име на герой от книгата е "   + characterName + ". "
               ;

    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    }

