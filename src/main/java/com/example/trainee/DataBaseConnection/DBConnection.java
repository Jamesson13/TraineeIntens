package com.example.trainee.DataBaseConnection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection instance;
    private Connection connection;

    private DBConnection() throws SQLException {
        try{
            Class.forName("org.postgresql.Driver");
            String ur1 = "jdbc:postgresql://192.168.0.109:5432/Users";
            String username = "postgres";
            String password = "Odessa1996";
            this.connection = DriverManager.getConnection(ur1,username,password);
        }catch (ClassNotFoundException ex){
            System.out.println("Database Connection Creation Faild : " + ex.getMessage());
        }
    }

    public Connection getConnection(){
        return connection;
    }

    public static DBConnection getInstance()throws SQLException{
        if (instance == null){
            instance = new DBConnection();
        }else if(instance.getConnection().isClosed()){
            instance = new DBConnection();
        }
        return instance;
    }
}
