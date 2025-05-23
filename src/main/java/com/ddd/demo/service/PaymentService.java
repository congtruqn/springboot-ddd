package com.ddd.demo.service;

import com.ddd.demo.controller.dtos.UserDto;
import com.ddd.demo.domain.model.Account;
import com.ddd.demo.infrastructure.repository.AccountRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaymentService {

    @Autowired
    private AccountRepository accountRepository;

    @Transactional
    public Account execute(String Id) {
        Optional<Account> payment = this.accountRepository.findByNumber(Id);
        if (!payment.isPresent()) {
            throw new IllegalArgumentException("Payment is not exist");
        }

        return payment.get();
    }

    @Transactional
    public String save(UserDto account) {
        Account a = new Account(account.getName());
        this.accountRepository.save(a);
        return "ok";
    }
}