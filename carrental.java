import java.util.*;

class CarRental {
    int CarID;
    String CarType;
    float Rent;

    void getCar() {
        Scanner in = new Scanner(System.in);   
        System.out.println("Car Type: ");
        CarType = in.nextLine();
        System.out.println("Car ID: ");
        CarID = in.nextInt();
        System.out.println();
    }

    void getRent() {
        switch (CarType) {
            case "SmallCar":
                Rent = 1000;  
                System.out.println("Rent: " + Rent);
                break;
            case "Van":
                Rent = 800;  
                System.out.println("Rent: " + Rent);
                break;
            case "SUV":
                Rent = 2500;  
                System.out.println("Rent: " + Rent);
                break;
            default:
                System.out.println("Invalid Car Type");
                Rent = 0;
        }
        System.out.println();
    }

    void getShowCar() {
        System.out.println("Car Type: " + CarType);
        System.out.println("Car ID: " + CarID);
        System.out.println("Rent: " + Rent);
    }
}

class Main {
    public static void main(String[] args) {
        CarRental C = new CarRental();
        C.getCar();
        C.getRent();
        C.getShowCar();
    }
}
