package models.validator;

import models.Combination;
import type.Error;

public class LengthValidator extends Validator {
    public LengthValidator(Validator next) {
        super(next);
    }

    @Override
    protected String validation(String combination) {
        String error = null;
        if(combination.length() != Combination.NUMBER_COLORS){
            error = Error.LENGTH.toString();
        }
        return error;
    }
}
