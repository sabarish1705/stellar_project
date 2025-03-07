
import java.util.Scanner;
public class Main{
    public Main(){
        System.out.println("constructer");
    }
    {
        System.out.println("non static block");
        
    }
    static{
        System.out.println("static block");
    }
    public void sub1(){
          System.out.println("sub1");
    }
    public  static void sub(){
          System.out.println("sub");
    }
    public static void main(String[]args)
    {
        Main obj1=new Main();
        sub();
        obj1.sub1();
        System.out.println("method");
    }
}
