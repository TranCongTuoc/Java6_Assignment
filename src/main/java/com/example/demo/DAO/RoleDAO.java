package com.example.demo.DAO;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.Domain.Role;

@Repository
public interface RoleDAO extends JpaRepository<Role,String>{

}
