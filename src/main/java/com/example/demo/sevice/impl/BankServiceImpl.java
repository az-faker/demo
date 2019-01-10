package com.example.demo.sevice.impl;

import com.example.demo.dao.BankDao;
import com.example.demo.domain.Bank;
import com.example.demo.sevice.BankService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * BankServiceImpl实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-01-08 10:35:58
 */
@Service
public class BankServiceImpl implements BankService {
    @Resource
    private BankDao bankDao;


    @Override
    public List<Bank> findAll() {
        return bankDao.findAll();
    }

    @Override
    public Bank findOne(Long id) {
        return bankDao.getOne(id);
    }

    @Override
    public Bank update(Bank bank) {
        return bankDao.saveAndFlush(bank);
    }

    @Override
    public Bank insert(Bank bank) {
        return bankDao.save(bank);
    }

    @Override
    public void delete(Long id) {
        bankDao.deleteById(id);
    }
}
