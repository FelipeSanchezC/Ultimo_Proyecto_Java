package exceptions;

public class registerException extends AssertionError{

    private static final long serialVersionUID = 1l;

    public registerException(String message, Throwable cause){
        super(message, cause);
    }
}
