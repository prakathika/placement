import java.util.*;
class Student
{
    String Name;
    String ID;
    void get( )
{
    for(int i=0;i<5;i++){
    Scanner in =new Scanner (System.in);   
    System.out.println("enter name:");
    Name = in.nextLine();
    System.out.println("enter ID:");
    ID= in.nextLine();
    System.out.println("Name " +Name+ " "+"ID:" +ID);
    }
}
}
class Main
{
	public static void main(String[] args) {
	    Student stu=new Student();
	    stu.get();
  }
}