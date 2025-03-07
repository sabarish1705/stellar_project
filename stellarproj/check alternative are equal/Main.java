import java.util.*;
public class Main {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       int n=s.length();
       for(int i=0;i<n;i++)
       {
            	  if(s.charAt(i)==s.charAt(i+2)&&s.charAt(i+1)==s.charAt(i+3)) {
            		  System.out.println("yes");
                  break;
              }
              
                 else 
            	  S.ystem.out.println("no");            	             	    	   
       break;
       }
       
	}
}
