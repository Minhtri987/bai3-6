package Hutech.bai36.validator;

import Hutech.bai36.entity.Category;
import Hutech.bai36.validator.annotation.ValidCategoryId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context) {
        return category!=null && category.getId()!=null;
    }
}
