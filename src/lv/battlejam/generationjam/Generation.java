package lv.battlejam.generationjam;

import java.util.ArrayList;
import java.util.Random;

import lv.battlejam.usermanagment.*;

public class Generation {

    private final static int KOMANDU_SKAITS = 5;
    
    public static String uzdevums() {

        String[] todos =
            {"lampa", "automatiska laistisana", "aizkari", "android",
                "enkurlinki"};
        return todos[new Random().nextInt(todos.length)];
    }

    public static ArrayList<Team> generateTeams() {

        Random rand = new Random();
        ArrayList<lv.battlejam.usermanagment.Member> saraksts =
            new ArrayList<Member>();

        saraksts.add(new Member("Edgars", "Garsneks"));
        saraksts.add(new Member("Agris", "Traskovs"));
        saraksts.add(new Member("Janis", "Kadegis"));
        saraksts.add(new Member("Marcis", "Kadegis"));
        saraksts.add(new Member("Krists", "Jankovskis"));
        saraksts.add(new Member("Renate", "Kazaka"));
        saraksts.add(new Member("Kristaps", "Mizga"));
        saraksts.add(new Member("Madara", "Sneidere"));
        saraksts.add(new Member("Janis", "Strazdins"));
        saraksts.add(new Member("Katrina", "Zvaigzne"));
        saraksts.add(new Member("Cirulis", "Davis"));
        saraksts.add(new Member("Janis", "Hofmanis"));

        // need to add filing the list
        int cilvekuSkaits = saraksts.size();
        int cilvekuSkaitsKomanda = cilvekuSkaits/KOMANDU_SKAITS ;
        ArrayList<Team> teamList = new ArrayList<Team>();
        
        for (int e = 0; e < KOMANDU_SKAITS ; e++) {
            teamList.add(new Team());
        }
        // saliek apalu skaitu cilveeku komandaas
        for (int i = 0; i < teamList.size(); i++) {
            Team t = teamList.get(i);
            for (int j = 0; j < cilvekuSkaitsKomanda; j++) {
                if (!saraksts.isEmpty()) {
                    int index = rand.nextInt(saraksts.size());
                    t.getMembers().add(saraksts.get(index));
                    saraksts.remove(index);
                }
            }

        }
        // ja paliek mazaak cilveeku paari aarpus komandaam nekaa komandu skaits tad iedala peec
        // kaartas paari palikushos
        if (!saraksts.isEmpty()) {
            for (int i = saraksts.size()-1; i >=0; i--) {
                teamList.get(i).getMembers().add(saraksts.get(i));
                saraksts.remove(i);
            }
        }

        return teamList;
    }

}
