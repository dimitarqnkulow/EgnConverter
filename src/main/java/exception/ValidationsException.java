package exception;

public class ValidationsException extends RuntimeException {
    private final ErrorCode errorCode;

    public ValidationsException(ErrorCode errorCode){
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public String getErrorMessage(){
      return errorCode.getMessage();
    }
}
