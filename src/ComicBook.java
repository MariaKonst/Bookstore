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
        System.out.println(this.toString() + " is on sale 60% with discounted price " + discountedPrice);
        return discountedPrice;
    }

    @Override
    public String toString() {
        return "ComicBook{" +
                super.toString() +
                "characterName='" + characterName + '\'' +
                '}';
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    }

