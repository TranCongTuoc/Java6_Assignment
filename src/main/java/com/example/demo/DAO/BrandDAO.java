package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Domain.Brand;

@Repository
public interface BrandDAO extends JpaRepository<Brand, Integer>{

}
