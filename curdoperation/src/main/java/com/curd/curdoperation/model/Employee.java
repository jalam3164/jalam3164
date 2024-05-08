package com.curd.curdoperation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="EMP_ID")
    private Integer empId;
    @Column(name="EMP_FIRST_NAME")
    private String empFirstName;
    @Column(name="EMP_LAST_NAME")
    private String empLastName;
    @Column(name="EMP_MAIL_ID")
    private String empMailId;
    @Column(name="EMP_ADDRESS")
    private String empAddress;
}
