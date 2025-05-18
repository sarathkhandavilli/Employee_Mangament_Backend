//package org.geeksforgeeks.gfg_spring_project.playground;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class PostgresJDBC {
//
//    static String dbUrl = "jdbc:postgresql://localhost:5432/postgres" ;
//    static String dbUser = "postgres" ;
//    static String dbpassword = "S@r@th!2025" ;
//
//    public static void main(String[] args) {
//
//        try {
//            System.out.println(readRecords()) ;
//        } catch (SQLException e) {
//            throw new RuntimeException(e) ;
//        }
//
//
//    }
//
//    public static Connection getConnection() throws SQLException {
//        return DriverManager.getConnection(dbUrl,dbUser,dbpassword) ;
//    }
//
//    public static void createTable() throws SQLException {
//        String sql = "CREATE TABLE IF NOT EXISTS employees (id SERIAL PRIMARY KEY , name VARCHAR(255) , age INTEGER); " ;
//        try (Connection connection = getConnection()) {
//            Statement statement = connection.createStatement() ;
//            statement.executeUpdate(sql) ;
//            System.out.println("Table created or already exists!");
//        }
//    }
//
//    public static void addEmployee(String name , int age ) throws SQLException {
//        String sql = "INSERT INTO employees (name , age ) VALUES (?,?) ;" ;
//        try (Connection connection = getConnection()) {
//            PreparedStatement prpstmt = connection.prepareStatement(sql) ;
//            prpstmt.setString(1,name);
//            prpstmt.setInt(2 , age);
//            int affectedRows = prpstmt.executeUpdate() ;
//            System.out.println(affectedRows + " row(s) inserted.");
//        }
//    }
//
//    public static void deleteEmployee(int id) throws SQLException {
//        String sql = " DELETE FROM employees WHERE id = ? " ;
//        try (Connection connection = getConnection()) {
//            PreparedStatement prpstmt = connection.prepareStatement(sql) ;
//            prpstmt.setInt(1,id);
//            int affectedRows = prpstmt.executeUpdate() ;
//            System.out.println(affectedRows + " row(s) deleted.");
//        }
//    }
//
//    public static void updateEmployee(String name , int age , int id) throws SQLException {
//        String sql = "UPDATE employees SET name = ? , age = ? WHERE id = ? " ;
//        try (Connection connection = getConnection()) {
//            PreparedStatement prpstmt = connection.prepareStatement(sql) ;
//            prpstmt.setString(1,name);
//            prpstmt.setInt(2 , age);
//            prpstmt.setInt(3,id);
//            int affectedRows = prpstmt.executeUpdate() ;
//            System.out.println(affectedRows + " row(s) inserted.");
//        }
//    }
//
//    public static List<Employee> readRecords() throws SQLException{
//        String sql = "SELECT * FROM employees" ;
//        List<Employee> employees = new ArrayList<>() ;
//        try (Connection conn = getConnection()) {
//            Statement statement = conn.createStatement() ;
//            ResultSet resultSet = statement.executeQuery(sql) ;
//
////            while (resultSet.next()) {
////                int id = resultSet.getInt("id") ;
////                String name = resultSet.getString("name") ;
////                int age = resultSet.getInt("age") ;
////                System.out.println("ID: "+id+" Name: "+name+" Age: "+age);
////            }
//
//            EmployeeRowMapper rowMapper = new EmployeeRowMapper() ;
//            while(resultSet.next()) {
//                employees.add(rowMapper.mapRow(resultSet , resultSet.getRow())) ;
//            }
//
//            return  employees ;
//
//        }
//    }
//
//
//}
