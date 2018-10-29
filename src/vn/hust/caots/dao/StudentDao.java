/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hust.caots.dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import vn.hust.caots.model.Student;
import vn.hust.caots.model.Subject;

/**
 *
 * @author Caots
 */
public class StudentDao {

    myConnection conn = new myConnection();
    private Connection connection;

    //-------------------------------Get List Student------------------------------
    public List<Student> getStudent() {
        String sql = "select st.id, st.name, st.dob , st.math_id , sb1.mark as math_mark , st.physics_id\n"
                + "        , sb2.mark as physics_mark from student as st , subject as sb1\n"
                + "        , subject as sb2 where sb1.id = st.math_id and sb2\n"
                + "        .id = st.physics_id";
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Student> studentsList = new ArrayList<>();
        try {
            connection = conn.connect();
            ps = (PreparedStatement) connection.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs == null) {
                System.out.println("Selcet User error, try again");
            } else {
                while (rs.next()) {
                    Student student = new Student();
                    student.setId(rs.getInt("id"));
                    student.setName(rs.getString("name"));
                    student.setDob(rs.getDate("dob"));
                    student.setMath(new Subject(rs.getDouble("math_mark"), rs.getInt("math_id")));
                    student.setPhysics(new Subject(rs.getDouble("physics_mark"), rs.getInt("physics_id")));
                    studentsList.add(student);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return studentsList;
    }
    public static void main(String[] args) {
        StudentDao dao=   new StudentDao();
        for (Student student : dao.getStudent()) {
            System.out.println(student);
            student.displayMark();
        }
    }

    public List<Subject> getSubject() {
        String sql = "select * from subject";
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Subject> subjectList = new ArrayList<>();
        try {
            connection = conn.connect();
            ps = (PreparedStatement) connection.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs == null) {
                System.out.println("Selcet User error, try again");
            } else {
                while (rs.next()) {
                    Subject subject = new Subject();
                    subject.setId(rs.getInt("id"));
                    subject.setMark(rs.getDouble("mark"));
                    subjectList.add(subject);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return subjectList;
    }

//-------------------------------SHow Student-----------------------------------
    public void displayAllStudent() {
        StudentDao stD = new StudentDao();
        for (Student student : stD.getStudent()) {
            System.out.println(student);
            student.displayMark();
        }
    }
//-------------------------------Add new Student, get maxID---------------------

    public Subject addNewSubject(Subject subject) {
        String sql = "insert into subject value(?, ?)";
        PreparedStatement ps = null;
        try {
            connection = conn.connect();
            ps = (PreparedStatement) connection.prepareStatement(sql);
            ps.setInt(1, subject.getId());
            ps.setDouble(2, subject.getMark());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return subject;
    }

    public int getMaxIDSubject() {
        String sql = "select max(id) as maxID from subject";
        try {
            connection = conn.connect();
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs == null) {
                System.out.println("Selcet maxID error, try again");
            } else {
                while (rs.next()) {
                    return rs.getInt("maxID") + 1;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int getMaxIDStudent() {
        String sql = "select max(id) as maxID from student";
        try {
            connection = conn.connect();
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs == null) {
                System.out.println("Selcet maxID error, try again");
            } else {
                while (rs.next()) {
                    return rs.getInt("maxID") + 1;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    //-------------------------------Add new Student--------------------------------
    public Student addNewStudent(Student student) {
        StudentDao studentDao = new StudentDao();
        String sql = "insert into student value(?, ?, ?, ? , ?)";
        PreparedStatement ps = null;
        try {
            Subject subject = new Subject();
            connection = conn.connect();
            ps = (PreparedStatement) connection.prepareStatement(sql);
            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.setDate(3, new Date(student.getDob().getTime()));
            Subject id_math = studentDao.getSubject().get(studentDao.getSubject().size() - 2);
            ps.setInt(4, id_math.getId());
            Subject id_physics = studentDao.getSubject().get(studentDao.getSubject().size() - 1);
            ps.setInt(5, id_physics.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return student;
    }
//-------------------------------Remove Student---------------------------------

    public boolean removeStudent(int id) {
        return false;
    }
//-------------------------------Update Student---------------------------------

    public boolean updateStudent(int id, Subject subject) {
        String sql = "update subject set mark = ? where id = ?";
        PreparedStatement ps =null;
        try{
            connection =conn.connect();
            ps = (PreparedStatement) connection.prepareStatement(sql);
            ps.setDouble(1, subject.getMark());
            ps.setInt(2, subject.getId());
            return ps.executeUpdate() > 0 ;
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
       
 
}
