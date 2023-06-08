package Hutech.bai36.validator.annotation;

import Hutech.bai36.validator.ValidUserIdValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidUserIdValidator.class)
@Documented
public @interface ValidUserId {
    String message() default "Invalid User ID";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
