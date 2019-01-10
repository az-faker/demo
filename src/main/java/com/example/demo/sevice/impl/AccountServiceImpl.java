package com.example.demo.sevice.impl;

import com.example.demo.dao.AccountDao;
import com.example.demo.domain.Account;
import com.example.demo.sevice.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * AccountServiceImpl实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-01-07 15:37:43
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    @Override
    public int add(Account account) {
        return accountDao.add(account);
    }

    @Override
    public int update(Account account) {
        return accountDao.update(account);
    }

    @Override
    public int delete(Long id) {
        return accountDao.delete(id);
    }

    @Override
    public Account findOne(Long id) {
        return accountDao.findOne(id);
    }

    @Override
    public List<Account> findList() {
        return accountDao.findList();
    }
}
