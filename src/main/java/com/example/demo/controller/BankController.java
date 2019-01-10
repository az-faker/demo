package com.example.demo.controller;

import com.example.demo.domain.Bank;
import com.example.demo.sevice.BankService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * BankController实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-01-08 10:49:46
 */
@RestController
@RequestMapping("/bank")
public class BankController {
    @Resource
    private BankService bankService;

    @GetMapping("/list")
    public List<Bank> getBanks() {
        return bankService.findAll();
    }

    @PutMapping("/update/{id}")
    public Bank update(@PathVariable Long id, @RequestParam String name, @RequestParam String address, @RequestParam String phone) {
        Bank bank = new Bank();
        bank.setId(id);
        bank.setName(name);
        bank.setAddress(address);
        bank.setPhone(phone);

        return bankService.update(bank);
    }
}
