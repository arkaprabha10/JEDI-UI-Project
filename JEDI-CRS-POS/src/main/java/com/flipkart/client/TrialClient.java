package com.flipkart.client;
import com.flipkart.utils.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class TrialClient {
    private static Connection connection = null;

    private static Connection getConn(){

        if (connection != null)
            return connection;
        else {
            try {
                String driver = "com.mysql.cj.jdbc.Driver";//prop.getProperty("driver");
                String url = "jdbc:mysql://localhost:3306/test_schema_v2";//prop.getProperty("url");
                String user ="root";// prop.getProperty("user");
                String password = "arkathegreat";//prop.getProperty("password");

                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("haha");
            return connection;
        }

    }

    public static void main(String[] args) throws SQLException {
//
        System.out.println("Main has started");
        final Connection conn = getConn();
        String query = "select * from admin" ;
        PreparedStatement queryStatement;

        queryStatement = conn.prepareStatement(query);
//        queryStatement.
        ResultSet rs=queryStatement.executeQuery();
        System.out.println(rs);
        while(rs.next())
        {
            System.out.println(rs.getString(1)); //or rs.getString("column name");
        }
        System.out.println("finished");
//        queryStatement.setString(1, newPassword);
//        queryStatement.setString(2, userID);
//        queryStatement.executeUpdate();

    }

}

