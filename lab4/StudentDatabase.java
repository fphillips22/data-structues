
import java.util.HashMap;
import java.util.HashSet;

public class StudentDatabase {

    private HashMap<String, HashSet<Student>> database;

    public StudentDatabase() {
        database = new HashMap<>();
    }

    public void addStudent(String name, int studentNumber, double gpa) {
        Student newStudent = new Student(name, studentNumber, gpa);
        if (!database.containsKey(name)) {
            database.put(name, new HashSet<>());
        }
        database.get(name).add(newStudent);
    }

    public void printDatabase() {
        for (String name : database.keySet()) {
            for (Student student : database.get(name)) {
                System.out.println(student.getName() + ": (ID=" + student.getIdNumber() + "), (gpa=" + student.getGPA() + ")");
            }
        }
        System.out.println();
    }

    public void removeStudent(String name) {
        database.remove(name);
    }

    public void countStudentsByName() {
        HashMap<String, Integer> hm = new HashMap<>();
        for (String name : database.keySet()) {
            for (Student student : database.get(name)) {
                Integer j = hm.get(student.getName());
                hm.put(name, (j == null) ? 1 : j + 1);
            }
        }
        for (HashMap.Entry<String, Integer> value : hm.entrySet()) {
            System.out.println(value.getKey() + ": " + value.getValue());
        }
    }

    public void findStudentByID(int id) {
        for (String name : database.keySet()) {
            for (Student student : database.get(name)) {
                if (student.getIdNumber() == id) {
                    System.out.println(student.getName() + ": (ID=" + student.getIdNumber() + "), (gpa=" + student.getGPA() + ")");
                }
            }
        }
    }

    public void printStudentsByGPA() {
        HashMap<Double, HashSet<Student>> hm = new HashMap<>();
        for (String name : database.keySet()) {
            for (Student student : database.get(name)) {
                if (!hm.containsKey(student.getGPA())) {
                    hm.put(student.getGPA(), new HashSet<>());
                }
                hm.get(student.getGPA()).add(student);
            }
            }
            for (double gpa : hm.keySet()){
                System.out.println(gpa+": ");
                for (Student student : hm.get(gpa)) {
                    System.out.println("\t" + student.getName() + ", " + student.getIdNumber());
                }
            }
    }
}

