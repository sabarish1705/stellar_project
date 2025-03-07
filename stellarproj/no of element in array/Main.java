import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        // Counting occurrences
        System.out.println("Number occurrences in the array:");
        for (int i = 0; i < size; i++) {
            if (array[i] == -1) continue; // Skip counted numbers
            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    count++;
                    array[j] = -1; // Mark as counted
                }
            }
            System.out.println(array[i] + " appears " + count + " times");
        }
    }
}
