package com.thitiwas.example.mssql.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "address", schema = "profile")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "address")
    private String address;

    @OneToOne
    @JoinColumn(name = "t1_user", referencedColumnName = "id")
    private UserEntity t1_user;
}
