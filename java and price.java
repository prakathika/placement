import java.util.*;

class Book {
    String title;
    int price;

    Book() {
        price = 100;
        System.out.println("java programming");
    }

    void display() {
        System.out.println("price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Book b = new Book();
        b.display();
    }
}
