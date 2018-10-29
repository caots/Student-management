/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hust.caots.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import vn.hust.caots.dao.StudentDao;
import vn.hust.caots.model.Student;
import vn.hust.caots.model.Subject;
import vn.hust.caots.service.StudentService;

/**
 *
 * @author Caots
 */
public class MyClassController {

    private static StudentService studentService = new StudentService();
    private static Scanner scanner = new Scanner(System.in);

    public void displayAllStudent() {
        studentService.displayAllStudent();
    }

    public void addNewStudent() {
        try {
            int id = studentService.getMaxIDStudent();
            System.out.println("Nhap Ho Va Ten: ");
            String name = scanner.nextLine();
            System.out.println("Nhap Ngay sinh: (yyyy-MM-dd)");
            String dob = scanner.nextLine();
            Date birthday = new SimpleDateFormat("yyyy-MM-dd").parse(dob);
            int mathID = studentService.getMaxIDSubject();
            System.out.println("Nhap diem mon toan");
            Double markMath = scanner.nextDouble();
            Subject subjectMark = new Subject(markMath, mathID);
            studentService.addNewSubject(subjectMark);
            int physicsID = studentService.getMaxIDSubject();
            System.out.println("Nhap diem mon vat Ly");
            double markPhysics = scanner.nextDouble();
            Subject subjectPhysics = new Subject(markPhysics, physicsID);
            studentService.addNewSubject(subjectPhysics);
            Student student = new Student(split(name), id, birthday, subjectMark, subjectPhysics);
            studentService.addNewStudent(student);
            System.out.println("Add success");
        } catch (ParseException ex) {
            System.out.println("Error: " + ex);
            System.out.println("Moi thuc hien lai");
        }
    }
    //-----------------------------SPLIT-------------------------------------------

    public String split(String name) {
        name = name.trim();
        name = name.replaceAll("\\s+", " ");
        String[] temp = name.split(" ");
        String str = "";
        for (int i = 0; i < temp.length; i++) {
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1) {
                str += " ";
            }
        }
        return str;
    }

    public void updateStudent() {
        System.out.println("Nhap id sinh vien can tim");
        int idStudent = scanner.nextInt();
        Student findStudent= null;
        for (Student student : studentService.getStudents()) {
            if(student.getId()== idStudent){
                student = findStudent;
            }
        }
        System.out.println("Nhap diem mon toan moi");
        double newMathMark = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhap diem mon ly moi");
        double newMathPhysics = scanner.nextDouble();
        
        int mathID = findStudent.getMath().getId();
        int physicsID = findStudent.getPhysics().getId();
        
        Subject studentMath = new Subject(newMathMark, mathID);
        Subject studentPhysics = new Subject(newMathPhysics, physicsID);
         if (studentService.updateStudent(mathID, studentMath)) {
            System.out.println("update mon toan thanh cong");
        } else {
            System.out.println("fail");
        }
        if (studentService.updateStudent(physicsID, studentPhysics)) {
            System.out.println("update mon ly thanh cong");
        } else {
            System.out.println("fail");
        }

    }

    public void findStudentWithMSSV() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeStudentWithMSSV() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
