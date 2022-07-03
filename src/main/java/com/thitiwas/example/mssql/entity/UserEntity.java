package com.thitiwas.example.mssql.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "t1_user", schema = "profile")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "first_name")
    private String firstName;


    @Column(name = "last_name")
    private String lastName;
}
