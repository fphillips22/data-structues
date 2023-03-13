/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.LinkedList;
import java.util.*;
/**
 *
 * @author yaw
 */
class StudentDatabase {

    private Student[] database;

    public StudentDatabase() {
        database = new Student[0];
    }

    public void addStudent(String name, int studentNumber, double gpa) {
        Student newStudent = new Student(name, studentNumber, gpa);
        Student[] tempDatabase = new Student[database.length + 1];

        for (int i = 0; i < database.length; i++) {
            tempDatabase[i] = database[i];
        }

        tempDatabase[database.length] = newStudent;
        database = tempDatabase;
    }

    public void printDatabase() {
        for (int i = 0; i < database.length; i++) {
            Student student = database[i];
            System.out.println(student.getName() + ": (ID=" + student.getIdNumber() + "), (gpa=" + student.getGPA() + ")");
        }
        System.out.println();
    }
    
    public void copyStudent(int idNumber) {
        Student[] tempDatabase = new Student[database.length + 1];

        for (int i = 0; i < database.length; i++) {
            tempDatabase[i] = database[i];
            if (database[i].getIdNumber() == idNumber) {
                tempDatabase[database.length] = database[i];
            }
        }

        database = tempDatabase;
    }
    
    public void updateGPA(int index, double newGPA) {
        database[index].changeGPA(newGPA);
    }


    public void findStudentByIndex(int index){
        System.out.println(database[index].getName()+": (ID=" + database[index].getIdNumber() + "), (gpa="+ database[index].getGPA()+")");
    }

    public void findStudentByName(String name){
        for (Student student : database) {
            if (student.getName().equals(name)) {
                System.out.println(student.getName() + ": (ID=" + student.getIdNumber() + "), (gpa=" + student.getGPA()+")");
            }
        }
    }

    public void removeStudent(int id){
        Student[] newDataBase = null;
        int k = 0;
        for (int i = 0; i < database.length; i++) {
            if (database[i].getIdNumber() == id) {
                newDataBase = new Student[database.length-1];
                System.arraycopy(database, 0, newDataBase, 0, i);
                if (database.length - 1 - i >= 0)
                    System.arraycopy(database, i + 1, newDataBase, i, database.length - 1 - i);
                break;
            }
        }
        database = newDataBase;

    }

}
