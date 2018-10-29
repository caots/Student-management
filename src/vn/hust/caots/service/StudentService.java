/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hust.caots.service;

import java.util.List;
import vn.hust.caots.controller.StudentController;
import vn.hust.caots.dao.StudentDao;
import vn.hust.caots.model.Student;
import vn.hust.caots.model.Subject;

/**
 *
 * @author Caots
 */
public class StudentService implements IStudent {

    @Override
    public List<Student> getStudents() {
        return new StudentDao().getStudent();
    }

    @Override
    public Student addNewStudent(Student student) {
        return new StudentDao().addNewStudent(student);
    }

    @Override
    public boolean removeStudent(int id) {
        return new StudentDao().removeStudent(id);
    }

    @Override
    public boolean updateStudent(int id, Subject subject) {
        return new StudentDao().updateStudent(id, subject);
    }

    @Override
    public Student searchStudent(int id) {
        return new StudentController().searchStudent(id);
    }

    @Override
    public List<Student> searchStudentABC(String ten) {
        return new StudentController().searchStudentABC(ten);
    }

    @Override
    public double lastMark(int id) {
        return new StudentController().lastMark(id);
    }

    @Override
    public double changeMarkMath(int id, double newMarkMath) {
        return new StudentController().changeMarkMath(id, newMarkMath);
    }

    @Override
    public double changeMarkPhysics(int id, double newMarkPhysics) {
        return new StudentController().changeMarkPhysics(id, newMarkPhysics);
    }

    @Override
    public long studentPay(int id) {
        return new StudentController().studentPay(id);
    }

    @Override
    public void SapXepTheoDTK() {
        new StudentController().SapXepTheoDTK();
    }

    @Override
    public Student findStudentMaxMark() {
        return new StudentController().findStudentMaxMark();
    }

    @Override
    public void displayAllStudent() {
        new StudentDao().displayAllStudent();
    }

    @Override
    public List<Subject> getSubject() {
        return new StudentDao().getSubject();
    }

    @Override
    public int getMaxIDStudent() {
        return new StudentDao().getMaxIDStudent();
    }

    @Override
    public int getMaxIDSubject() {
        return new StudentDao().getMaxIDSubject();
    }

    @Override
    public void addNewSubject(Subject subject) {
         new StudentDao().addNewSubject(subject);
    }

}
