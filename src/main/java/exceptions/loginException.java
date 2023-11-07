package exceptions;

public class loginException extends AssertionError {

    private static final long serialVersionUID = 1l;

    public loginException(String message, Throwable cause){
        super(message, cause);
    }
}
