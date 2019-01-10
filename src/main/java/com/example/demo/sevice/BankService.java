package com.example.demo.sevice;

import com.example.demo.domain.Bank;

import java.util.List;

/**
 * BankService实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-01-08 10:24:57
 */
public interface BankService {
    List<Bank> findAll();

    Bank findOne(Long id);

    Bank update(Bank bank);

    Bank insert(Bank bank);

    void delete(Long id);
}
