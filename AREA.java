import java.util.*;
class Main{
   
    static Scanner in = new Scanner(System.in);
    static void area()
    {
        int a;
        a =in.nextInt();
        System.out.println("Area of square: "+(a*a));
    }
    static void area(int a,int b)
        {
             System.out.println("Area of rectangle: "+(a*b));
        }
    static void area(double r)
    {
         System.out.println("Area of circle: "+(3.14*r*r));
    }
    public static void main(String[] args){
         
         area();
         int a=in.nextInt();
         int b=in.nextInt();
         area(a,b);
         double r=in.nextDouble();
         area(r);
     }
}
