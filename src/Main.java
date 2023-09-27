import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FeesManagementSystem feesManagementSystem = new FeesManagementSystem();
        Scanner scanner = new Scanner(System.in);

        // Add students
        Student student1 = new Student("2023101", "Smriti Gupta", 400000);
        Student student2 = new Student("2023102", "Ayush Aggrawal", 400000);
        Student student3 = new Student("2023103", "Jyoti Yadav", 400000);
        Student student4 = new Student("2023104", "Kisan Ghosh", 400000);
        Student student5 = new Student("2023105", "Yashwant Sinha", 400000);
        feesManagementSystem.addStudent(student1);
        feesManagementSystem.addStudent(student2);
        feesManagementSystem.addStudent(student3);
        feesManagementSystem.addStudent(student4);
        feesManagementSystem.addStudent(student5);


        // Collect fees
        feesManagementSystem.collectFees("2023101", 200000);
        feesManagementSystem.collectFees("2023102", 150000);
        feesManagementSystem.collectFees("2023103", 250000);
        feesManagementSystem.collectFees("2023104", 250000);
        feesManagementSystem.collectFees("2023105", 200000);


        // Display student information
        System.out.print("Enter student ID to display information: ");
        String studentId = scanner.next();
        feesManagementSystem.displayStudentInfo(studentId);
    }
}
