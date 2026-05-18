/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author M S I
 */
public class Koneksi {
    public static Connection getConnection() throws Exception {
       String url = "jdbc:mysql://localhost:3306/todo_db";
       String user = "root";
       String pass = ""; 
       
       return DriverManager.getConnection(url, user, pass);
    }  
}
