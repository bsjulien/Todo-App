package com.julien.todo.validators;

import com.julien.todo.dto.CategoryDto;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

public class CategoryValidator {

    public static List<String> validateCategory(CategoryDto categoryDto) {
        List<String> errors = new ArrayList<>();
        if (categoryDto == null) {
            errors.add("Please fill the name");
            errors.add("Please fill the description");
            return  errors;
        }
        if (ObjectUtils.isEmpty(categoryDto.getName())) {
            errors.add("Please fill the name");
        }
        if (ObjectUtils.isEmpty(categoryDto.getDescription())) {
            errors.add("Please fill the description");
        }
        return errors;
    }
}
