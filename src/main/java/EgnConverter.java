import exception.ValidationsException;
import model.Gender;
import model.PersonalInfo;
import utils.EgnReader;
import java.time.LocalDate;
import java.time.Period;

//всичко да е private и да чета за енкапсулацията
public class EgnConverter {
    //Това са константни променлви
    private static final int MONTH_21ST_CENTURY_MIN = 41;
    private static final int MONTH_21ST_CENTURY_MAX = 52;

    public static void main(String[] args) {
        String egn;

            try {
                egn = EgnReader.readEgnFromJson();
                EgnValidator.validateEgn(egn);
            } catch (ValidationsException e){
                System.out.println(e.getErrorMessage());
                return;
            }

        PersonalInfo personalInfo = new PersonalInfo();
        personalInfo.setBirthDate(getBirthDate(egn));
        personalInfo.setGender(getGender(egn));
        personalInfo.setAge(getAge(egn));
        System.out.println(personalInfo.printMyProperties());
    }

    private static LocalDate getBirthDate (String egn) {
        LocalDate birthDate;
        int year = Integer.parseInt(egn.substring(0,2));
        int month = Integer.parseInt(egn.substring(2,4));
        int day = Integer.parseInt(egn.substring(4,6));
        if(month >= MONTH_21ST_CENTURY_MIN && month <= MONTH_21ST_CENTURY_MAX){
            year += 2000;
            month -= 40;
        } else {
            year += 1900;
        }

        birthDate = LocalDate.of(year,month,day);

        return birthDate;
    }
    private static String getGender(String egn){
        int genderDigit = Character.getNumericValue(egn.charAt(7));
        if(genderDigit % 2 == 0){
            return Gender.MALE.toDisplay();
        }else {
            return Gender.FEMALE.toDisplay();
        }
    }
    private static int getAge(String egn){
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = getBirthDate(egn);
        int age = Period.between(birthDate,currentDate).getYears();
        return age;
    }
}