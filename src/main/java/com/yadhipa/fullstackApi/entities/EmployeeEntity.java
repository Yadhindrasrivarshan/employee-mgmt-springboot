package com.yadhipa.fullstackApi.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "employee_details")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private  String lastName;
    private String emailId;
}

