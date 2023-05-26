package com.julien.todo.validators;

import com.julien.todo.dto.UserDto;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

public class UserValidator {

    public static List<String> validateUser(UserDto user) {
        List<String> errors = new ArrayList<>();
        if (user == null) {
            errors.add("Please fill the First name");
            errors.add("Please fill the Last name");
            errors.add("Please fill the User name");
            errors.add("Please fill the user Email");
            errors.add("Please fill the User Password");
            return errors;
        }

        if (ObjectUtils.isEmpty(user.getFirstName())){
            errors.add("Please fill the First name");
        }
        if (ObjectUtils.isEmpty(user.getLastName())){
            errors.add("Please fill the Last name");
        }
        if (ObjectUtils.isEmpty(user.getUserName())){
            errors.add("Please fill the User name");
        }
        if (ObjectUtils.isEmpty(user.getEmail())){
            errors.add("Please fill the user Email");
        }
        if (ObjectUtils.isEmpty(user.getPassword())){
            errors.add("Please fill the User Password");
        }

        return errors;
    }

    public static List<String> validateUserCredentials(String email, String password) {
        List<String> errors = new ArrayList<>();
        if (ObjectUtils.isEmpty(email)) {
            errors.add("Email is empty");
        }
        if (ObjectUtils.isEmpty(password)) {
            errors.add("Password is empty");
        }
        return errors;
    }
}
