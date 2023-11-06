public class ComicBook extends Book{


    private String  characterName;
    @Override
    public double getPrice(){
        return super.getPrice()*0.4;
    }



    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    }

