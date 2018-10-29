/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hust.caots.service;

import java.util.List;
import vn.hust.caots.model.Student;
import vn.hust.caots.model.Subject;

/**
 *
 * @author Caots
 */
public interface IStudent {
    
    public void displayAllStudent();

    public List<Student> getStudents();
    
    public List<Subject> getSubject();
    
    public Student addNewStudent(Student student);

    public boolean removeStudent(int id);

    public boolean updateStudent(int id, Subject subject);

    public Student searchStudent(int id);

    public List<Student> searchStudentABC(String ten);

    public double lastMark(int id);

    public double changeMarkMath(int id, double newMarkMath);

    public double changeMarkPhysics(int id, double newMarkPhysics);

    public long studentPay(int id);

    public void SapXepTheoDTK();

    public Student findStudentMaxMark();
    
    public int getMaxIDStudent();
    
    public int  getMaxIDSubject();
    
    public void addNewSubject(Subject subject);
}
