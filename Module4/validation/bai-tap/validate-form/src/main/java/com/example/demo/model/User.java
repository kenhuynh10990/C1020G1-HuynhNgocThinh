package com.example.demo.model;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
@Entity
public class User implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotEmpty
    @Size(min = 5,max = 45)
    private String firstName;
    @NotEmpty
    @Size(min = 5,max = 45)
    private String lastName;
    private String phoneNumber;
    @Min(18)
    private int age;
    @NotEmpty
    @Email
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User)target;
        String phoneNumber=user.getPhoneNumber();
        ValidationUtils.rejectIfEmpty(errors,"phoneNumber","number.empty");
        if (phoneNumber.length()>11||phoneNumber.length()<10){
            errors.rejectValue("phoneNumber","phoneNumber.length");
        }
        if (!phoneNumber.startsWith("0")){
            errors.rejectValue("phoneNumber","phoneNumber.startsWith");
        }
        if (!phoneNumber.matches("(^$|[0-9]*$)")){
            errors.rejectValue("phoneNumber","phoneNumber.matches");
        }

    }
}
