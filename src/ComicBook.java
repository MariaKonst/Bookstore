public class ComicBook extends Book{


    private String  characterName;
    public ComicBook(){ }
    public ComicBook(String title, Author author, BookType type, int available, double price, String characterName){
        super(title,author,type, available, price);
        this.characterName=characterName;
    }
    @Override
    public double getPrice(){
        System.out.println(super.getTitle() + " is on sale 60%");
        return super.getPrice()*0.4;
    }



    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    }

