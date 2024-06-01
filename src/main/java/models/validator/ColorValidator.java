package models.validator;

import models.Combination;
import type.Error;

public class ColorValidator extends Validator {
    public ColorValidator(Validator next) {
        super(next);
    }

    @Override
    protected String validation(String combination) {
        String error = null;
        if(!combination.matches(Combination.PATTERN)){
            error = Error.NOT_COLOR.toString();
        }
        return error;
    }
}
