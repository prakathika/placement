import java.util.*;
class  CarRental()
{
    int Car ID
    String Car Type;
    float Rent();
   
{
    void get Car( )
    Scanner in =new Scanner (System.in);   
    System.out.println("Car Type: ");
    CarType= in.nextLine();
    System.out.println("Car ID: ");
    CarID= in.nextLine();
    System.out.println( );
    }
}
 void get Rent( ){
     switch(CarType)
     {
         case(SmallCar);
         System.out.println("Rent : 1000" );
         break;
         case(Van);
         System.out.println( "Rent : 800");
         break;
         case(SUV);
         System.out.println("Rent : 2500" );
         break;
     }
         System.out.println( );

 }
 void get ShowCar( ){
    Scanner in =new Scanner (System.in);   
             System.out.print( "Car Type: "+Car Type);
             System.out.print( " Car ID:"+ Car ID);
             System.out.print("Rent:" + Rent);
 }

}
class Main
{
	public static void main(String[] args) {
	    CarRental C=new Student();
	    C.get Car();
	    C.get Rent();
	    C.get ShowCar();
  }
}