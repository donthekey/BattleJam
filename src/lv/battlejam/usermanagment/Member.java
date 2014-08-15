package lv.battlejam.usermanagment;


public class Member {

    private String name;
    private String surname;
    private Team team;

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
