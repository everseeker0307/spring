package com.everseeker.spring.validator;

import com.everseeker.spring.validator.annotation.DataValidator;
import com.everseeker.spring.validator.constraints.RegexType;

import java.util.UUID;

/**
 * Created by everseeker on 16/8/9.
 */
public class User {
    private String id;

    @DataValidator(max = 16, notEmpty = true)
    private String username;

    @DataValidator(min = 6)
    private String password;

    @DataValidator(regexType = RegexType.EMAIL)
    private String email;

    @DataValidator(regexType = RegexType.PHONE)
    private String cellphone;

    public User(String username, String password, String email, String cellphone) {
        this.id = UUID.randomUUID().toString().replace("-", "");
        this.username = username;
        this.password = password;
        this.email = email;
        this.cellphone = cellphone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }
}
