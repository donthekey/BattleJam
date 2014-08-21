package lv.battlejam.usermanagment;

import java.util.ArrayList;

public class Team {

    private ArrayList<Member> members = new ArrayList<Member>();

    private String name;

    public ArrayList<Member> getMembers() {

        return members;
    }

    public void setMembers(ArrayList<Member> members) {

        this.members = members;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    
   
}
