import java.util.*;
class Add{
    private int a,b,c,d;
    public void sum()
    {
    Scanner in=new Scanner(System.in);
    a=in.nextInt();
    b=in.nextInt();
    c=in.nextInt();
    d=a+b+c+d;
    System.out.println("sum="+ d);
    }
    
}
public class Main
{
	public static void main(String[] args) {
		Add obj=new Add();
		obj.sum();
}
}