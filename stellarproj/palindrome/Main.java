import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        if (isPalindrome(input)) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is NOT a palindrome.");
        }
    }
    public static boolean isPalindrome(String str) {
        StringBuffer sb = new StringBuffer(str);
        String reversed = sb.reverse().toString(); 
        return str.equals(reversed); 
    }
}


