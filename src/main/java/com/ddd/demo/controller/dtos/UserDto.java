package com.ddd.demo.controller.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class UserDto {

    private long id;

    // user name should not be null or empty
    // user name should have at least 2 characters
    @NotEmpty
    @Size(min = 2, message = "user name should have at least 2 characters")
    private String name;


    // password should not be null or empty
    // password should have at least 8 characters
    @NotEmpty
    @Size(min = 8, message = "password should have at least 8 characters")
    private String password;

    public UserDto() {

    }

    public UserDto(String name, String email, String password) {
        super();
        this.name = name;

        this.password = password;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
