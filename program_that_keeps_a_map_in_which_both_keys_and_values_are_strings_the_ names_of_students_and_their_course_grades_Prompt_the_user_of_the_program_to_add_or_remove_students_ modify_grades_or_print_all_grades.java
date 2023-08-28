package mypkg;
import java.util.*;

public class map {
    public static void main(String[] args) {
        Map<String, String> gradeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Modify Grade");
            System.out.println("4. Print All Grades");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String addName = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    String addGrade = scanner.nextLine();
                    gradeMap.put(addName, addGrade);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.nextLine();
                    gradeMap.remove(removeName);
                    break;
                case 3:
                    System.out.print("Enter student name to modify: ");
                    String modifyName = scanner.nextLine();
                    if (gradeMap.containsKey(modifyName)) {
                        System.out.print("Enter new grade: ");
                        String newGrade = scanner.nextLine();
                        gradeMap.put(modifyName, newGrade);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.println("Grades:");
                    for (Map.Entry<String, String> entry : gradeMap.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
