package com.example.demo.controller;

import com.example.demo.domain.Account;
import com.example.demo.sevice.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * AccountController实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-01-07 15:40:20
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Resource
    private AccountService accountService;

    @GetMapping("/list")
    public List<Account> getAccounts() {
        return accountService.findList();
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable("id") Long id) {
        return accountService.findOne(id);
    }

    @PutMapping("/{id}")
    public Boolean updateAccount(@PathVariable("id") Long id, @RequestParam String name, @RequestParam Double money) {
        Account account = new Account();
        account.setName(name);
        account.setId(id);
        account.setMoney(money);

        int t = accountService.update(account);
        return t == 1;
    }

    @PostMapping("/add")
    public Boolean addAccount(@RequestParam String name, @RequestParam Double money) {
        Account account = new Account();
        account.setName(name);
        account.setMoney(money);

        int t = accountService.add(account);
        return t == 1;
    }
}
