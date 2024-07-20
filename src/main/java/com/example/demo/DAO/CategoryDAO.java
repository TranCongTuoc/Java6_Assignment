package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Domain.Category;

@Repository
public interface CategoryDAO extends JpaRepository<Category, Integer>{

}
