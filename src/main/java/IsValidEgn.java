public class IsValidEgn {
    public static boolean isValidEgn(String egn){
        if(egn == null){
            return false;
        }
        if(!egn.matches("^\\d{10}$")){
            return false;
        }
        return true;
    }
}
