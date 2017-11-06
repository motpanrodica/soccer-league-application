package application;

public class Game {
    public Team homeTeam;
    public Team awayTeam;
    public Goal [] goals;

    public void printGoals(){
        System.out.println("Goals:");
        for (Goal g : goals){
            g.printGoal();
        }

    }
}