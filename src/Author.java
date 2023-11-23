public class Author {


    private String authorName;
    private int  authorAge;

    Author(){
        this.authorName = " ";
        this.authorAge = 100;
    }
   public Author(String authorName, int authorAge){
        this.authorName =authorName;
        this.authorAge = authorAge;
    }


    @Override
    public String toString() {
        return  authorName  +", като авторът е на "
                 + authorAge + " години. "
                ;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getAuthorAge() {
        return authorAge;
    }

    public void setAuthorAge(int authorAge) {
        this.authorAge = authorAge;
    }
}
