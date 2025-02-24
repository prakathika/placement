abstract class MyAbstractClass{
    static int staticMember;
    public abstract void find();
    static{
        staticMember =100;
        System.out.println("static Member Intialized to :"+staticMember );
        
    }
    public static void displaystaticMember(){
        System.out.println("static Member value : "+staticMember);
    }
}
class concrete extends MyAbstractClass{
    
    public void find(){
    System.out.println(" The final method is implemented in concrete class ");
    }
}
public class Main{
    public static void main(String [] args){
        MyAbstractClass.displaystaticMember();
        concrete obj=new concrete();
    }
}