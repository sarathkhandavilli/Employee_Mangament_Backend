//package org.geeksforgeeks.gfg_spring_project.playground;
//
//import org.springframework.jdbc.core.RowMapper;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//
//public class EmployeeRowMapper implements RowMapper<Employee> {
//
//    @Override
//    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
//        return Employee.builder()
//                .id(rs.getInt("id"))
//                .name(rs.getString("name"))
//                .age(rs.getInt("age"))
//                .build();
//    }
//}
