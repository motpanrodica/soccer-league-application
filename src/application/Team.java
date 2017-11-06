package application;

public class Team {
    public String nameTeam;
    public Player [] players;

    public void printRoster(){

        System.out.println(nameTeam + ":");

        for (Player p : players){
            System.out.println(p.name);
        }
        System.out.println();
    }
}
