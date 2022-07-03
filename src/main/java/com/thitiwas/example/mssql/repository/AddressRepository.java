package com.thitiwas.example.mssql.repository;

import com.thitiwas.example.mssql.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
