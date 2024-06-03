package controllers.validator;

import type.Error;

import java.util.HashSet;
import java.util.Set;

public class DuplicatedValidator extends Validator {

    public DuplicatedValidator(Validator next) {
        super(next);
    }

    @Override
    protected String validation(String combination) {
        char[] chars = combination.toCharArray();
        Set<Character> combinationSet = new HashSet<>();
        for(char character : chars){
            combinationSet.add(character);
        }
        String error = null;
        if(combination.length() != combinationSet.size()){
            error = Error.DUPLICATED.toString();
        }
        return error;
    }
}
