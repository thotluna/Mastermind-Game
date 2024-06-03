package controllers.validator;

public class ValidatorHandler {
    private final Validator validator;

    public ValidatorHandler() {
        ValidatorFactory factory = new ValidatorFactory();
        validator = factory.getValidator();
    }

    public String validate(String combination){
        return validator.validate(combination);
    }
}
