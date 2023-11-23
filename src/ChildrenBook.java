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
     double price = super.getOriginalPrice();
     double discountedPrice = price * 0.3;
     System.out.println(this.toString() + " е на намаление от 70% на нова цена от  " + discountedPrice + "лв. ");
     return discountedPrice;
}

    @Override
    public String toString() {
        return
                super.toString()+
                "Подходяща е за деца на " + age + " години." + "\n"+
                        "Книгата";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
