import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int length = input.length(); // Get length of string
        int mid = length / 2; // Find the middle index
        if (length % 2 == 0) {
            System.out.println("Middle characters: " + input.charAt(mid - 1) + input.charAt(mid));
        } else {
            System.out.println("Middle character: " + input.charAt(mid));
        }
    }
}

