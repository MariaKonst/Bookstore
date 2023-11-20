public class ComicBook extends Book{


    private String  characterName;
    public ComicBook(){ }
    public ComicBook(String title, Author author, BookType type, int available, double price, String characterName){
        super(title,author,type, available, price);
        this.characterName=characterName;
    }
    @Override
    public double getPrice(){
        double price = super.getPrice();
        double discountedPrice = price * 0.4;
        System.out.println(this.toString() + " е на 60% намаление на нова цена от  " + discountedPrice + " лв.");
        return discountedPrice;
    }

    @Override
    public String toString() {
        return
                super.toString() + "Име на герой от книгата е "   + characterName + ". "
                + " Продадената книга";

    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    }

