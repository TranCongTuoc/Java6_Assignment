package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Domain.Products;

import java.util.List;

@Repository
public interface ProductDAO extends JpaRepository<Products, Integer> {

	@Query(value = "select * from products where categoryid = ?", nativeQuery = true)
	List<Products> findByCategory(Integer categoryid);
}
