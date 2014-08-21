package lv.battlejam.generationjam;

import java.util.ArrayList;
import java.util.Random;

import lv.battlejam.usermanagment.*;

public class Generation {

    public static void main(String[] args) {

        Random rand = new Random();
        ArrayList<lv.battlejam.usermanagment.Member> saraksts =
            new ArrayList<Member>();
        // need to add filing the list
        int b = saraksts.size();
        int a = b % 4;
        ArrayList<Team> teamList = new ArrayList<Team>();
        for (int e = 1; e < 5; e++) {
            teamList.add(new Team());
        }
        // saliek apalu skaitu cilveeku komandaas
        for (int i = 0; i <= teamList.size(); i++) {
            do {
                int t = rand.nextInt(b - i);
                teamList.get(i).getMembers().add(saraksts.get(t));
                saraksts.remove(t);
            } while (teamList.get(i).getMembers().size() < a);
        }
        // ja paliek mazaak cilveeku paari aarpus komandaam nekaa komandu skaits tad iedala peec
        // kaartas paari palikushos
        if (a > 0) {
            for (int i = 1; i < a; i++) {
                teamList.get(i).getMembers().add(saraksts.get(i));
                saraksts.remove(1);
            }
        }
        // random temata izveele
        System.out.println(uzdevums());

    }

    private static String uzdevums() {

        String[] todos =
            {"lampa", "automatiska laistisana", "aizkari", "android",
                "enkurlinki"};
        return todos[new Random().nextInt(todos.length)];
    }

}
