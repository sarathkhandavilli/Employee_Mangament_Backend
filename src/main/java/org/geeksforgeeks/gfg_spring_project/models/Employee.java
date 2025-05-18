package org.geeksforgeeks.gfg_spring_project.models;


import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@With
@Entity
@Table(name = "employee")
public class Employee {

    // Primary Key
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id" , nullable = false)
    private long id ;

    @Column(name = "first_name",nullable = false)
    private  String firstName ;

    @Column(name = "last_name",nullable = false)
    private  String lastName ;

    @Column(name = "dob",nullable = false)
    private Instant dateOfBirth ;

    @Column(name = "doj",nullable = true)
    private Instant joiningDate ;

    @Column(name = "salary" , nullable = false)
    private double salary ;

    @Column(name = "designation" , nullable = false)
    private String designation ;

    @Column(name = "email" , nullable = false)
    private String email ;
}
