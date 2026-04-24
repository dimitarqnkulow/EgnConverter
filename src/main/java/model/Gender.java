package model;

public enum Gender {
    MALE,
    FEMALE;
    public String toDisplay(){
        return this == MALE ? "Male" : "Female";
    }
}
