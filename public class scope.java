import java.util.*;
class Add{
    public int a,b,c;
    public void sum()
    {
    System.out.println("sum=: "+c );
    }
    
}
class Main
{
	public static void main(String[] args) {
	    Add obj=new Add();
	    Scanner in=new Scanner(System.in);
	    obj.a=in.nextInt();
	    obj.b=in.nextInt();
	    obj.c=obj.a+obj.b;
		obj.sum();
}
}