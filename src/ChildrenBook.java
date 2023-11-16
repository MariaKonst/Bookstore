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
     double price = super.getPrice();
     double discountedPrice = price * 0.3;
     System.out.println(this.toString() + " е на напмаление от  70% на цена от  " + discountedPrice + "лв. ");
     return discountedPrice;
}

    @Override
    public String toString() {
        return "ChildrenBook{" +
                super.toString()+
                "age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
