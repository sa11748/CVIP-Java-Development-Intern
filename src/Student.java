public class Student {
    private String studentId;
    private String name;
    private double feesPaid;
    private double totalFees;

    public Student(String studentId, String name, double totalFees) {
        this.studentId = studentId;
        this.name = name;
        this.totalFees = totalFees;
        this.feesPaid = 0;
    }

    // Getters and setters for the fields

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getFeesPaid() {
        return feesPaid;
    }

    public double getTotalFees() {
        return totalFees;
    }

    public void setFeesPaid(double feesPaid) {
        this.feesPaid = feesPaid;
    }
}
