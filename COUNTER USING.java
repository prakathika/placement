
class Counter{
   static int count=0;
   
Counter(){
    count+=1;
    System.out.println("Object Created! Current Code="+count);
}
}
class Main{
   public static void main(String[] args) {
       Counter obj1 =new Counter();
       Counter obj2=new Counter();
       Counter obj3=new Counter();
    }
}
