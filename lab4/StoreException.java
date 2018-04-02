package labs_java.lab4;

public class StoreException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private String message;

    public StoreException(String message) {
        super();
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return message;
    }
}
