package models.validator;

public abstract class Validator {
    private final Validator nextValidator;

    protected Validator(Validator nextValidator) {
        this.nextValidator = nextValidator;
    }

    public String validate(String combination) {
        String error = validation(combination);
        if(error != null){
            return error;
        }else{
            if(nextValidator != null){
                return nextValidator.validate(combination);
            }else{
                return null;
            }
        }
    }

    protected abstract String validation(String combination);
}
