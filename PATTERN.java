import java.util.*;
class Outer{
    static class Inner{
        static void display(){
            for(int i=1;i<=5;i++){
                    for(int j=1;j<=i;j++){
                        if(j==2||j==4){
                            System.out.print("# ");
                        }
                        else{
                             System.out.print("* ");
                        }
                    }
                     System.out.println();
            }
        }
    }
    
}
class Main{
    public static void main(String[] args){
        Outer.Inner obj=new Outer.Inner();
        obj.display();
    }
}