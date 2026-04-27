import exception.ErrorCode;
import exception.ValidationsException;

import java.util.List;

public class EgnValidator {
    public static void validateEgn(egn){
        if (egn == null) {
            throw new ValidationsException(ErrorCode.EGN_MISSING);
        }
        if(!egn.matches("^\\d{10}$")){
            throw new ValidationsException(ErrorCode.EGN_INVALID);
        }
        //валидация за месец от 1 до 12
    }
}