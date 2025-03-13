import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private String name;
    private int id;
    private int age;

    public Employee(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    private static ArrayList<Employee> employees = new ArrayList<>();
    
    public static void addEmployee(String name, int id, int age) {
        employees.add(new Employee(name, id, age));
    }
    
    public static void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() + ", Age: " + employee.getAge());
        }
    }
    
    public static void removeEmployee(int id) {
        employees.removeIf(employee -> employee.getId() == id);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Remove Employee");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                System.out.print("Enter Age: ");
                int age = scanner.nextInt();
                addEmployee(name, id, age);
            } else if (choice == 2) {
                displayEmployees();
            } else if (choice == 3) {
                System.out.print("Enter ID to remove: ");
                int id = scanner.nextInt();
                removeEmployee(id);
            } else if (choice == 4) {
                break;
            }
        }
        scanner.close();
    }
}
