package database;

import data.Ticket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public void User(String login,String password)
    {
        Connection conn = null;
        String url = "jdbc:sqlserver://localhost\\MSSQLSERVER02:1433;databaseName=Hotels;encrypt=true;trustServerCertificate=true";
        try {
            // db parameters
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            // create a connection to the database
            conn = DriverManager.getConnection(url,"Taras","1111");
            //System.out.println("Connection to MSSQLSERVER02 for InsertBoots established");

            String SqlQuery = "INSERT INTO dbo.Users VALUES (" + "'" + login + "','" + password + "');";
            PreparedStatement preparedStatement = conn.prepareStatement(SqlQuery);
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    public void ActUser(String login,String password)
    {
        Connection conn = null;
        String url = "jdbc:sqlserver://localhost\\MSSQLSERVER02:1433;databaseName=Hotels;encrypt=true;trustServerCertificate=true";
        try {
            // db parameters
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            // create a connection to the database
            conn = DriverManager.getConnection(url,"Taras","1111");
            //System.out.println("Connection to MSSQLSERVER02 for InsertBoots established");

            String SqlQuery = "INSERT INTO dbo.ActUser VALUES (" + "'" + login + "','" + password + "');";
            PreparedStatement preparedStatement = conn.prepareStatement(SqlQuery);
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    public void Ticket(Ticket ticket)
    {
        Connection conn = null;
        String url = "jdbc:sqlserver://localhost\\MSSQLSERVER02:1433;databaseName=Hotels;encrypt=true;trustServerCertificate=true";
        try {
            // db parameters
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            // create a connection to the database
            conn = DriverManager.getConnection(url,"Taras","1111");
            //System.out.println("Connection to MSSQLSERVER02 for InsertBoots established");

            String SqlQuery = "INSERT INTO dbo.Tickets VALUES (" + "'" + ticket.getName() + "','" + ticket.getType() + "','" + ticket.getTime() + "','" + ticket.getTransport() + "','" + ticket.getMeal() + "','" + ticket.getCost() + "');";
            PreparedStatement preparedStatement = conn.prepareStatement(SqlQuery);
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
