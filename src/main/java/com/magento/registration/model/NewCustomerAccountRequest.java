package com.magento.registration.model;

import com.magento.registration.utils.PasswordMatches;
import com.magento.registration.utils.ValidEmail;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@PasswordMatches
public class NewCustomerAccountRequest implements Serializable{

    @NotNull
    private String firstName;

    private String middleName;

    @NotNull
    private String lastName;

    @ValidEmail
    @NotNull
    private String emailAddress;

    @NotNull
    private String password;

    @NotNull
    private String confirmPassword;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
