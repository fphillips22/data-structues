public class Student {
    private String name;
    private int idNumber;
    private double gpa;
    
    public Student (String name, int idNumber, double gpa) {
        this.name = name;
        this.idNumber = idNumber;
        this.gpa = gpa;
    }
    
    public String getName() {
        return name;
    }
    
    public int getIdNumber() {
        return idNumber;
    }
    
    public double getGPA() {
        return gpa;
    }
    
    public void changeGPA(double gpa) {
        this.gpa = gpa;
    }
}
