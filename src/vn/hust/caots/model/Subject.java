/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hust.caots.model;

import java.util.Scanner;

/**
 *
 * @author Caots
 */
public class Subject {

    private int id;
    private double mark;
    private String name;
    private double ratio;// hệ số 
    private boolean isPractice;

    public Subject() {
        super();
    }
    public Subject(double mark, int id){
        this.id= id;
        this.mark=mark;
    }

//    public Subject(String name, double ratio, boolean isPractice) {
//        this.name = name;
//        this.ratio = ratio;
//        this.isPractice = isPractice;
//    }
//
//    public double getRatio1() {
//        if (this.isPractice) {
//            return 2;
//        } else {
//            return 1;
//        }
//    }
//    
//    public void inputMark() {
//        System.out.println("Nhap diem mon hoc:" + this.getName());
//        Scanner scanner = new Scanner(System.in);
//        double mark = scanner.nextDouble();
//        this.setMark(mark);
//    }
//
//    public void updateMark(double newMark) {
//        this.setMark(newMark);
//
//    }
//
//    public Subject(int mark, String name, double ratio, boolean isPractice) {
//        super();
//        this.mark = mark;
//        this.name = name;
//        this.ratio = ratio;
//        this.isPractice = isPractice;
//    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
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

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    public boolean isIsPractice() {
        return isPractice;
    }

    public void setIsPractice(boolean isPractice) {
        this.isPractice = isPractice;
    }

    @Override
    public String toString() {
        return " [" + "id: " + id + ", mark=" + mark + ']';
    }

}
