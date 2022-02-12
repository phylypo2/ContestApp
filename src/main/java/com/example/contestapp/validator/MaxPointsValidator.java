package com.example.contestapp.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDateTime;
import java.util.Objects;

public class MaxPointsValidator implements ConstraintValidator<MaxPoints, Integer> {

    private int maxPoints;

    @Override
    public void initialize(MaxPoints constraintAnnotation) {
        maxPoints = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(Integer passedValue, ConstraintValidatorContext constraintValidatorContext) {
        if (Objects.isNull(passedValue)) {
            return false;
        }
        if (maxPoints > 12) {
            return false;
        }
        return passedValue <= maxPoints;
    }
}
