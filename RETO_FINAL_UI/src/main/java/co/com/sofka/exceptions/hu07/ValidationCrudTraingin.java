package co.com.sofka.exceptions.hu07;

public class ValidationCrudTraingin extends AssertionError{
    public static final String VALIDATION_DO_NOT_MATCH = "The validation don't match. %s";
    public static final String VALIDATION_DO_NOT_FOUND = "The validation don't found. %s";

    public ValidationCrudTraingin(String message, Throwable cause)
    {
        super(message,cause);
    }
}
