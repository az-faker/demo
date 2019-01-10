package com.example.demo.dao;

import com.example.demo.domain.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * BankDao实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-01-08 10:23:58
 */
public interface BankDao extends JpaRepository<Bank, Long> {
}
