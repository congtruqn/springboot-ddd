package com.ddd.demo.domain.model;
import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "accounts") // accounts is table name in DB
public class Account {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private UUID accountId;
    @Column(name = "account_name", nullable = true)
    private String accountName;
    @Column(name = "created_date", nullable = true)
    private Date createdDate;
    @Column(name = "last_updated", nullable = true)
    private Date lastUpdated;

    public Account(String accountName) {
        super();
        this.accountName = accountName;
    }
}
