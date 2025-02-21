
public class Book extends Object{
    String name;
    String color;
    String price;
    //Constructor
    Book(){

    }
    Book(String name, String color, String price){
        super();
        this.name=name;
        this.color=color;
        this.price=price;
    }

    @Override
    public String toString() {
     return "Name: "+name+" Color: "+color+" Price: "+price;
    }






}