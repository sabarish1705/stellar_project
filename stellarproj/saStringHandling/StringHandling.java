import java.util.Scanner;

public class StringHandling {
		
	public static void main(String[] args)
	{
		String s1,s2,s3,s4="Hello how are you";
		int choice;
		Scanner s=new Scanner(System.in);
		System.out.println("1.Len 2.Cmp 3.Join 4.To lower 5.To upper 6. Replace 7.Search 8. Equal/not 9.is Empty 10.Ends with");
		System.out.println("Enter your choice");
		choice=s.nextInt();
			
		switch(choice)
{
		case 1: System.out.println("Enter a String to find length :");
		s1=s.next();
		System.out.println(s1.length());
		break;
			
		case 2: System.out.println("Enter 2 Strings to compare:");
		s1=s.next();
		s2=s.next();
		if(s1.compareTo(s2)==0)
		System.out.println("Strings are equal");
		else
		System.out.println("Strings are not equal");
		break;
		
		case 3: System.out.println("Enter 2 Strings to concat:");
		s1=s.next();
		s2=s.next();
		System.out.println(s1.concat(s2));
		break;
		
		case 4: System.out.println("Enter a String to convert into lowercase:");
		s1=s.next();
		System.out.println(s1.toLowerCase());
		break;
		
		case 5: System.out.println("Enter a String to convert into uppercase:");
		s1=s.next();
		System.out.println(s1.toUpperCase());
		break;
		
		case 6: System.out.println("Enter a string to replace a character 'h' with 't':");
		s1=s.next();
		System.out.println(s1.replace('h', 't'));
		break;
		
		case 7: System.out.println("Enter a string to search the substring - are :");
		s1=s.next();
		System.out.println(s1.contains("are"));
		break;
		
		case 8: System.out.println("Enter 2 strings to check equal :");
		s1=s.next();
		s2=s.next();
		System.out.println(s1.equalsIgnoreCase(s2));
		break;
		
		case 9: 
		s3="";
        System.out.println(s3.isEmpty());
		break;
		
		case 10:
		System.out.println("strings ends with - you ?:");
		System.out.println(s4.endsWith("you"));
		break;		
		
		}		
	}
}
