package lv.battlejam.usermanagment;

import java.io.Serializable;


public class Member implements Serializable{

    private static final long serialVersionUID = 3089308838985141008L;
    private String name;
    private String surname;
    private Team team;

    
    public Member(String name,String surname){
        this.name = name;
        this.surname = surname;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {

        this.surname = surname;
    }

    public Team getTeam() {

        return team;
    }

    public void setTeam(Team team) {

        this.team = team;
    }

 
}
