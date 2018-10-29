/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hust.caots.dao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vn.hust.caots.config.config;

/**
 *
 * @author Caots
 */
public class myConnection {

    private Connection conection;

    public Connection connect() {
        try {
            Class.forName(config.DRIVER);
            conection = (Connection) DriverManager.getConnection(config.URL, config.USERNAME, config.PASSWORD);
            System.out.println("ok");
        } catch (SQLException ex) {
            Logger.getLogger(myConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(myConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conection;
    }

    public static void main(String[] args) {
        myConnection c = new myConnection();
        c.connect();
    }
}
