import java.time.LocalDate;

public class PersonalInfo{
    private LocalDate birthDate;
    private String gender;
    private int age;

    public LocalDate getBirthDate(){
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate){
        this.birthDate = birthDate;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String printMyProperties(){
        String printInfo =
                "Birth date: " + this.birthDate + "\n"
                + "Gender: " + this.gender + "\n"
                + "Age: " +this.age + "\n" ;
        return printInfo;
    }
}
