package com.thitiwas.example.mssql.controller;

import com.thitiwas.example.mssql.entity.Address;
import com.thitiwas.example.mssql.repository.AddressRepository;
import com.thitiwas.example.mssql.repository.UserRepository;
import com.thitiwas.example.mssql.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    private final UserRepository userRepository;
    private final AddressRepository addressRepository;

    @Autowired
    public HelloController(UserRepository userRepository, AddressRepository addressRepository) {
        this.userRepository = userRepository;
        this.addressRepository = addressRepository;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("hello");
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserEntity>> getUserAll() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @GetMapping("/address")
    public ResponseEntity<List<Address>> getAddressAll() {
        return ResponseEntity.ok(addressRepository.findAll());
    }


}
