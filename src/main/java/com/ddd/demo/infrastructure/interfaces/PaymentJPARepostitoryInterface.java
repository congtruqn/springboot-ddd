package com.ddd.demo.infrastructure.interfaces;

import com.ddd.demo.domain.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PaymentJPARepostitoryInterface extends JpaRepository<Account, String> {

}