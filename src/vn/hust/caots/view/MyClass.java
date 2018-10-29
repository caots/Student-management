/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hust.caots.view;

import java.util.Scanner;
import vn.hust.caots.service.StudentService;

/**
 *
 * @author Caots
 */
public class MyClass {
    private static StudentService studentService= new StudentService();
    private static Scanner scanner = new Scanner(System.in);
    
    public void displayAllStudents(){
        studentService.displayAllStudent();
    }
}
