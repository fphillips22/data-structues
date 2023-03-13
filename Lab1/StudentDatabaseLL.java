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
public class StudentDatabaseLL {
    public Node firstNode;
    public Node lastNode;

    public StudentDatabaseLL() {

    }

    public void addStudent(String name, int studentNumber, double gpa) {
        Student newStudent = new Student(name, studentNumber, gpa);
        Node newNode = new Node(newStudent);
        if (firstNode == null) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            lastNode.setNext(newNode);
            lastNode = newNode;
        }
    }

    public void printDatabase() {
        Node currentNode = firstNode;
        while (currentNode != null) {
            System.out.println(currentNode.getStudent().getName() + ": (ID=" + currentNode.getStudent().getIdNumber() + "), (gpa=" + currentNode.getStudent().getGPA() + ")");
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }

    public void findStudentByIndex(int index){
        int count = 0;
        Node current = firstNode;
        while (current.getNext() != null){
            if (count == index){
                System.out.println(current.getStudent().getName() + ": (ID=" + current.getStudent().getIdNumber() + "), (gpa=" + current.getStudent().getGPA() + ")");
                break;
            }
            else {
                current.setNext(current.getNext());
                count++;
            }
        }
    }

    public void findStudentByName(String name){
        Node currentNode = firstNode;
        while(currentNode.getNext() != null){
            if (currentNode.getStudent().getName().equals(name)){
                System.out.println(currentNode.getStudent().getName() + ": (ID=" + currentNode.getStudent().getIdNumber() + "), (gpa=" + currentNode.getStudent().getGPA() + ")");
            }
            currentNode = currentNode.getNext();
        }
    }

    public void removeStudent(int id){

        Node temp = firstNode, prev = null;
        if (temp != null && temp.getStudent().getIdNumber() == id){
            firstNode = temp.getNext();
            return;
        }
        while (temp !=  null && temp.getStudent().getIdNumber() != id){
            prev = temp;
            temp = temp.getNext();
        }
        if (temp == null){
            return;
        }
        assert prev != null;
        prev.setNext(temp.getNext());
    }

}

