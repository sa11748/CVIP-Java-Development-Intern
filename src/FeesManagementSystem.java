import java.util.HashMap;
import java.util.Map;

public class FeesManagementSystem {
    private Map<String, Student> students;

    public FeesManagementSystem() {
        this.students = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.put(student.getStudentId(), student);
    }

    public Student getStudent(String studentId) {
        return students.get(studentId);
    }

    public void collectFees(String studentId, double amount) {
        Student student = students.get(studentId);
        if (student != null) {
            double currentFeesPaid = student.getFeesPaid();
            student.setFeesPaid(currentFeesPaid + amount);
        } else {
            System.out.println("Student not found with ID: " + studentId);
        }
    }

    public void displayStudentInfo(String studentId) {
        Student student = students.get(studentId);
        if (student != null) {
            System.out.println("Student ID: " + student.getStudentId());
            System.out.println("Student Name: " + student.getName());
            System.out.println("Total Fees:  ₹ " + student.getTotalFees());
            System.out.println("Fees Paid:  ₹ " + student.getFeesPaid());
            System.out.println("Remaining Fees:  ₹ " + (student.getTotalFees() - student.getFeesPaid()));
        } else {
            System.out.println("Student not found with ID: " + studentId);
        }
    }
}
