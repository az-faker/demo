package com.example.demo.sevice;

import com.example.demo.domain.Account;

import java.util.List;

/**
 * AccountService实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-01-07 15:35:20
 */
public interface AccountService {

    int add(Account account);

    int update(Account account);

    int delete(Long id);

    Account findOne(Long id);

    List<Account> findList();
}