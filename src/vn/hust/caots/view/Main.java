/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hust.caots.view;

import java.util.Scanner;
import vn.hust.caots.controller.MyClassController;


/**
 *
 * @author Caots
 */
public class Main {
    private static MyClassController myClassController= new MyClassController();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        System.out.println("Chuong trinh quan ly sinh vien");
        printAction();
        try {
            while (flag) {
                System.out.println("Nhap vao lua chon cua ban");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 0:
                        printAction();
                        break;
                    case 1:
                        displayAllStudents();
                        break;
                    case 2:
                        addNewStudent();
                        break;
                    case 3:
                       updateStudent();
                        break;
                    case 4:
                      
                        break;
                    case 5:
                       
                        break;
                    case 6:
                       
                        break;
                    case 7:
                        
                        break;
                    case 8:
                       
                        break;
                    case 9:
                       
                        break;
                    case 10:
                        
                        break;
                    case 11:
                        
                        break;
                    case 12:
                        
                        break;
                    case 20:
                        flag = false;
                        break;
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
            System.out.println("Try Again");
        }

    }
    //-----------------------------displayAllStudents-------------------------------

    public static void displayAllStudents() {
        System.out.println("Hien thi danh sach sinh vien");
        myClassController.displayAllStudent();
    }
    public static void addNewStudent(){
        System.out.println("Them sinh vien");
        myClassController.addNewStudent();
    }
    public static void updateStudent(){
        System.out.println("chinh sua sinh vien");
        myClassController.updateStudent();
    }
    public static void findStudentWithMSSV(){
         System.out.println("Tim sinh vien theo MSSV");
         myClassController.findStudentWithMSSV();
    }
    public static void removeStudentWithMSSV(){
         System.out.println("Tim sinh vien theo MSSV");
         myClassController.removeStudentWithMSSV();
    }

    //-----------------------------printAction-----------------------------------
    public static void printAction() {
        System.out.println("Day la menu huong dan. Chon");
        System.out.println("0.In ra huong dan");
        System.out.println("1.Hien thi danh sach");
        System.out.println("2.Them sinh vien");
        System.out.println("3.chinh sua diem sinh vien");
//        System.out.println("4.Tim sinh vien theo MSSV");
//        System.out.println("5.Xoa sinh vien theo MSSV");
//        System.out.println("6.Tim Sinh vien theo bang chu cai");
//        System.out.println("7.thay diem mon toan");
//        System.out.println("8.thay diem mon vat ly");
//        System.out.println("9.Tinh diem tong ket");
//        System.out.println("10.Hoc Phi");
//        System.out.println("11.sap xep sinh vien theo diem tong ket");
//        System.out.println("12.Tim sinh vien co diem tong ket cao nhat ");
        System.out.println("20.Thoat chuong trinh");
    }
}
