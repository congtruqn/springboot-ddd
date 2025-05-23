package com.ddd.demo.domain.repository;

import com.ddd.demo.domain.model.Account;

import java.util.Optional;

public interface IAccountRepository{
    public Account save(Account account);
    public Optional<Account> findByNumber(String number);
    public void deleteAll();
}
