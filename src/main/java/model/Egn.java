package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Egn {
    @JsonProperty("egns")
    private List<String> egn;
    public Egn(){

    }
    public Egn(List<String> egn) {
        this.egn = egn;
    }
    public List<String> getEgn() {
        return egn;
    }

    public void setEgn(List<String> egn) {
        this.egn = egn;
    }
}