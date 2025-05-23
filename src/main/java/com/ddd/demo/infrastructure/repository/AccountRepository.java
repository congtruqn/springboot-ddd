package com.ddd.demo.infrastructure.repository;

import com.ddd.demo.domain.model.Account;
import com.ddd.demo.domain.repository.IAccountRepository;
import com.ddd.demo.infrastructure.interfaces.PaymentJPARepostitoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountRepository implements IAccountRepository{

    @Autowired
    PaymentJPARepostitoryInterface paymentJPARepostitoryInterface;

    @Override
    public Account save(Account account) {
        //return null;
        return paymentJPARepostitoryInterface.save(account);
    }

    @Override
    public Optional<Account> findByNumber(String number) {
        return null;
        //return crudRepository.findByNumber(number);
    }

    @Override
    public void deleteAll() {

    }
}
