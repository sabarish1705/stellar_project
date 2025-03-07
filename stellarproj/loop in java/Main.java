/*class Main {
    public static void main(String[] args) {
        int count=1;
        while(count<11){
            System.out.println("count is :"+count);
            count++;
        }
    }
}

class Main {
    public static void main(String[] args) {
        int i;
        for(i=10;i>=1;i--){
            System.out.println("count is:"+i);
        }
        }
    
}
import java.util.*;
class Main {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter number");
        int a=sc.nextInt();
        for(i=1;i<=100;i++){
            System.out.println(a+" x "+i+" = "+(a*i));
        }
        }
    
}



//sum of n number
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
         System.out.println("sum"+sum);
        
    }
    
}



//factorial of n number
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
         System.out.println("factorial of "+n+" is "+fact);
        
    }
    
}


//reverse the number
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int rem,rev=0;
        int b=a;
        while(a>0)
        {
            rem=a%10;
            rev=rev*10+rem;
            a=a/10;
        }
         System.out.println("the reverse number of "+b+" is "+rev);
        
    }
    
}*/


//equation progm
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
	double x,y;
	double result=(b*b)-4*a*c;
	if(result>0.0)
	{
	    x=(-b+Math.pow(result,0.5))/(2.0*a);
	    y=(-b-Math.pow(result,0.5))/(2.0*a);
	    System.out.println("The Roots are"+x+"and "+y);
	}
	else if(result==0.0){
	    x=-b/(2.0*a);
	    System.out.println("The Roots is:"+x);
	}
	else
	System.out.println("The equation has no real roots");
	}
}










