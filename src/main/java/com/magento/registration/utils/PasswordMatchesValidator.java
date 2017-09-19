package com.magento.registration.utils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.magento.registration.model.NewCustomerAccountRequest;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

    @Override
    public void initialize(final PasswordMatches constraintAnnotation) {

    }

    @Override
    public boolean isValid(final Object obj, final ConstraintValidatorContext context) {
        final NewCustomerAccountRequest userRequest = (NewCustomerAccountRequest) obj;
        return userRequest.getPassword().equals(userRequest.getConfirmPassword());
    }

}

