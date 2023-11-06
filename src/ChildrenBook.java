public class ChildrenBook extends Book{


    private int age;
    public ChildrenBook(){

    }
    public ChildrenBook(String title, Author author, BookType type, int available, double price, int age){
        super(title, author, type, available, price);
        this.age = age;
    }
 @Override
 public double getPrice(){

     System.out.println(super.getTitle() + " is on sale 70%");
        return super.getPrice()*0.3;
}



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
