package by.seven.exception;

public class UserValidationException extends Exception{

    public UserValidationException() {
    }

    public UserValidationException(String message) {
        super(message);
    }
}
