/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaw
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Testing array implementation...");
        StudentDatabase database1 = new StudentDatabase();
        
        database1.addStudent("Joe Schmo", 1101, 3.2);
        database1.addStudent("Katie Katerson", 31415926, 3.7);
        database1.addStudent("Watson TheBassetHound", 12345, 2.4);
        database1.addStudent("Alice", 3748, 3.3);
        database1.addStudent("Alice", 9876, 3.1);
        
        database1.printDatabase();
        System.out.println();
        
        database1.findStudentByIndex(1);
        database1.findStudentByName("Alice");
        System.out.println();
        database1.removeStudent(1101);
        database1.printDatabase();
        database1.removeStudent(9876);
        database1.printDatabase();
        database1.removeStudent(12345);
        database1.printDatabase();

        System.out.println("Testing linked list implementation...");
        StudentDatabaseLL database2 = new StudentDatabaseLL();
        
        database2.addStudent("Joe Schmo", 1101, 3.2);
        database2.addStudent("Katie Katerson", 31415926, 3.7);
        database2.addStudent("Watson TheBassetHound", 12345, 2.4);
        database2.addStudent("Alice", 3748, 3.3);
        database2.addStudent("Alice", 9876, 3.1);

        database2.printDatabase();

        database2.findStudentByIndex(1);
        System.out.println();
        database2.findStudentByName("Alice");
        System.out.println("\n");
        database2.removeStudent(1101);
        database2.printDatabase();
        database2.removeStudent(9876);
        database2.printDatabase();
        database2.removeStudent(12345);
        database2.printDatabase();
    }
    
}
