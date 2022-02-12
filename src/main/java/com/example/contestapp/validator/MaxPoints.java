package com.example.contestapp.validator;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = MaxPointsValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MaxPoints {

    int value();

    String message() default "{com.example.contestapp.validator.MaxPoints.message}";

    Class<? extends Payload>[] payload() default {};

    Class<?>[] groups() default {};
}
