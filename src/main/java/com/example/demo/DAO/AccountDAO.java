package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Domain.Account;

@Repository
public interface AccountDAO extends JpaRepository<Account, String>{
}
