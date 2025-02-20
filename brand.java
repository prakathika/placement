
class Car{
   
    String brand;
   

    Car() {
        this.brand="unknown";
    }

    void setbrand(String brand) {
        this.brand = brand;
    }
    void display(){
        System.out.println(brand);
    }
}
        
              

class Main {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.setbrand("apple");
        obj.display();
        
    }
}
