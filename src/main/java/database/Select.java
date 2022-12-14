package database;

import data.Ticket;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class Select {
    public boolean SelectUser(String login,String password)
    {
        Connection conn = null;
        String url = "jdbc:sqlserver://localhost\\MSSQLSERVER02:1433;databaseName=Hotels;encrypt=true;trustServerCertificate=true";
        try {
            // db parameters
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            // create a connection to the database
            conn = DriverManager.getConnection(url,"Taras","1111");
            Statement statement = conn.createStatement();
            String SqlQuery = "SELECT * FROM dbo.Users WHERE Login = " + "'" + login + "'" + " and Password = " + "'" + password + "'";
            ResultSet resultSet = statement.executeQuery(SqlQuery);
            if(resultSet.next())
            {
                return true;
            }
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
        return false;
    }
    public ObservableList<Ticket> SortByC()
    {
        Connection conn = null;
        ObservableList<Ticket> list = FXCollections.observableArrayList();
        String url = "jdbc:sqlserver://localhost\\MSSQLSERVER02:1433;databaseName=Hotels;encrypt=true;trustServerCertificate=true";
        try {
            // db parameters
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            // create a connection to the database
            conn = DriverManager.getConnection(url,"Taras","1111");
            Statement statement = conn.createStatement();
            String SqlQuery = "SELECT * FROM dbo.Tickets ORDER BY Cost ASC";
            ResultSet resultSet = statement.executeQuery(SqlQuery);
            String name = null;
            String type = null;
            String time = null;
            String transport = null;
            String meal = null;
            int cost;
            while (resultSet.next())
            {
                name = resultSet.getString("Name");
                type = resultSet.getString("Type");
                time = resultSet.getString("Time");
                transport = resultSet.getString("Transport");
                meal = resultSet.getString("Meal");
                cost = resultSet.getInt("Cost");
                list.add(new Ticket(name,type,time,transport,meal,cost));
            }
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
        return list;
    }
    public ObservableList<Ticket> SortByT()
    {
        Connection conn = null;
        ObservableList<Ticket> list = FXCollections.observableArrayList();
        String url = "jdbc:sqlserver://localhost\\MSSQLSERVER02:1433;databaseName=Hotels;encrypt=true;trustServerCertificate=true";
        try {
            // db parameters
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            // create a connection to the database
            conn = DriverManager.getConnection(url,"Taras","1111");
            Statement statement = conn.createStatement();
            String SqlQuery = "SELECT * FROM dbo.Tickets ORDER BY Type ASC";
            ResultSet resultSet = statement.executeQuery(SqlQuery);
            String name = null;
            String type = null;
            String time = null;
            String transport = null;
            String meal = null;
            int cost;
            while (resultSet.next())
            {
                name = resultSet.getString("Name");
                type = resultSet.getString("Type");
                time = resultSet.getString("Time");
                transport = resultSet.getString("Transport");
                meal = resultSet.getString("Meal");
                cost = resultSet.getInt("Cost");
                list.add(new Ticket(name,type,time,transport,meal,cost));
            }
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
        return list;
    }
    public ObservableList<Ticket> SortByTr()
    {
        Connection conn = null;
        ObservableList<Ticket> list = FXCollections.observableArrayList();
        String url = "jdbc:sqlserver://localhost\\MSSQLSERVER02:1433;databaseName=Hotels;encrypt=true;trustServerCertificate=true";
        try {
            // db parameters
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            // create a connection to the database
            conn = DriverManager.getConnection(url,"Taras","1111");
            Statement statement = conn.createStatement();
            String SqlQuery = "SELECT * FROM dbo.Tickets ORDER BY Transport ASC";
            ResultSet resultSet = statement.executeQuery(SqlQuery);
            String name = null;
            String type = null;
            String time = null;
            String transport = null;
            String meal = null;
            int cost;
            while (resultSet.next())
            {
                name = resultSet.getString("Name");
                type = resultSet.getString("Type");
                time = resultSet.getString("Time");
                transport = resultSet.getString("Transport");
                meal = resultSet.getString("Meal");
                cost = resultSet.getInt("Cost");
                list.add(new Ticket(name,type,time,transport,meal,cost));
            }
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
        return list;
    }
}
