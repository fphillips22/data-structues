

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentDatabase database = new StudentDatabase();
        
        database.addStudent("Joe Schmo", 1101, 3.2);
        database.addStudent("Joe Schmo", 99999, 4.0);
        database.addStudent("Katie Katerson", 31415926, 3.7);
        database.addStudent("Watson TheBassetHound", 12345, 2.4);
        database.addStudent("Lizzie", 88888, 3.7);
        database.findStudentByID(1101);
        database.findStudentByID(99999);
        database.findStudentByID(31415926);
        database.findStudentByID(88888);
        database.findStudentByID(12345);
        System.out.println();
        database.countStudentsByName();
        System.out.println();
        database.printStudentsByGPA();
        System.out.println();

    }
    
}
