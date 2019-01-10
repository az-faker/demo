package com.example.demo.dao.impl;

import com.example.demo.dao.AccountDao;
import com.example.demo.domain.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * AccountDaoImpl实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-01-07 15:16:58
 */
@Repository
public class AccountDaoImpl implements AccountDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Account account) {
        return jdbcTemplate.update("insert into account (name, money) values (?, ?)",
                account.getName(), account.getMoney());
    }

    @Override
    public int update(Account account) {
        return jdbcTemplate.update("update account set name = ?, money = ? where id = ?",
                account.getName(), account.getMoney(), account.getId());
    }

    @Override
    public int delete(Long id) {
        return jdbcTemplate.update("delete from account where id = ?", id);
    }

    @Override
    public Account findOne(Long id) {
        List<Account> list = jdbcTemplate.query("select * from account where id = ?", new Object[]{id},
                new BeanPropertyRowMapper<>(Account.class));
        if (!CollectionUtils.isEmpty(list)) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<Account> findList() {
        List<Account> list = jdbcTemplate.query("select * from account", new Object[]{},
                new BeanPropertyRowMapper<>(Account.class));
        if (!CollectionUtils.isEmpty(list)) {
            return list;
        }
        return null;
    }
}
