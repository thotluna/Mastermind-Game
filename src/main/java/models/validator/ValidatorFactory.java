package models.validator;

public class ValidatorFactory {

    private final Validator validator;

    public ValidatorFactory() {
        Validator lengthValidator = new DuplicatedValidator(null);
        Validator colorValidator = new ColorValidator(lengthValidator);
        validator = new LengthValidator(colorValidator);
    }

    public Validator getValidator() {
        return validator;
    }
}
