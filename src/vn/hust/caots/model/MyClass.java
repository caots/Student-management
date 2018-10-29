/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hust.caots.model;

import java.util.ArrayList;

/**
 *
 * @author Caots
 */
public class MyClass {

    private String name;
    private ArrayList<Student> studentList;
    
    public MyClass(){
        
    }

    public MyClass(String name) {
        this.name = name;
        studentList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

}
