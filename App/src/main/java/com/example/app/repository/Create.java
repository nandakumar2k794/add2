package com.example.app.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import com.example.app.model.Food;
public class Create {
       String url="jdbc:mysql://localhost:3306/jdbc_demo";
       String username="root";
       String password="Nandu133";

       String sql1="INSERT INTO Student (id,name,price) VALUES (?,?,?)";
       {
       try
       {
       Connection con =DriverManager.getConnection(url,username,password);
       PreparedStatement ps = con.prepareStatement(sql1);
       ps.setInt(1, id);
       ps.setString(2, name);
       ps.setInt(3, price);

       Statement st=con.createStatement();
       int rows = ps.executeUpdate();
      if(rows>0){
        System.out.println("Student inserted succesfully");
      }

      ps.close();
      con.close();
       }catch(SQLException e){
        throw new RuntimeException(e);
       }
    }
}
