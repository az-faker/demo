package com.example.demo.dao;

import com.example.demo.domain.Account;

import java.util.List;

/**
 * AccountDao实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-01-07 15:13:44
 */
public interface AccountDao {
    int add(Account account);

    int update(Account account);

    int delete(Long id);

    Account findOne(Long id);

    List<Account> findList();
}
