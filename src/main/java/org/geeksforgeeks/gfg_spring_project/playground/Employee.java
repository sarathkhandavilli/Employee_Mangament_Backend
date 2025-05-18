package org.geeksforgeeks.gfg_spring_project.playground;

import lombok.*;

import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@With
@ToString
public class Employee {

//    private UUID employeeId ;
//    private String firstName ;
//    private String lastName ;
//    private Date dateOfBirth ;
//    private String department ;
//    private  String designation ;
//    private String location ;
//    private Date joiningDate ;
//    private String salary ;
//    private Employee manager ;
//    private String phoneNumber ;
//    private String emailAddress ;
//    private  boolean isNewTaxRegime ;
//    private String address ;
//    private int noticePeriod ;

    private long id ;
    private  String name ;
    private int age ;
}
