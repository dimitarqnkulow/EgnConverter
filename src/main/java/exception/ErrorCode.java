package exception;

public enum ErrorCode {
    EGN_MISSING("EGN is required!"),
    EGN_INVALID("EGN must be 10 digits!");

    private final String message;

    ErrorCode(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
