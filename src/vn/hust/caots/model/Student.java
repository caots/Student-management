/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hust.caots.model;

import java.util.Date;
import vn.hust.caots.config.Learing;

/**
 *
 * @author Caots
 */
public class Student {

    private static Learing learing = new Learing();

    private String name;
    private int id;
    private Date dob;
    private Subject math;
    private Subject physics;
    // he so mon toan la 3 va k thuc hanh
    //vat li he so 2 va co thuc hanh

    public Student() {
        super();
    }

//    public void contructorSubject() {
//        math = new Subject("math", 3, false);
//        physics = new Subject("physics", 2, true);
//    }
//    public void inputSubject() {
//        contructorSubject();
//        math.inputMark();
//        physics.inputMark();
//
//    }
//    public double tinhDienTongKet() {
//        return ((math.getRatio()* math.getMark()+ physics.getRatio() * physics.getMark())/(math.getRatio() + physics.getRatio()));
//    }
//    public void Pay() {
//        System.out.println(learing.HOCPHI * (math.getRatio1()*math.getRatio() + physics.getRatio1()*physics.getRatio())+" đ");
//    }
//    public void updateStudentMarkMath(double newMarkMath) {
//        math.updateMark(newMarkMath);
//    }
//    public void updateStudentMarkPhysics(double newMarkPhysics) {
//        math.updateMark(newMarkPhysics);
//    }
    public Student(String name, int id, Date dob, Subject math, Subject physics) {
        super();
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.math = math;
        this.physics= physics;

    }

    public Student(String name, int id, Date dob) {
        super();
        this.name = name;
        this.id = id;
        this.dob = dob;
    }
    public void displayMark(){
        System.out.println("\tMath: "+math);
        System.out.println("\tPhysics: "+physics);
    }


    public Subject getMath() {
        return math;
    }

    public void setMath(Subject math) {
        this.math = math;
    }

    public Subject getPhysics() {
        return physics;
    }

    public void setPhysics(Subject physics) {
        this.physics= physics;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "* Name: " + name + "  [" + " id =" + id + ", Date Of Birth =" + dob + ']';
    }

}
