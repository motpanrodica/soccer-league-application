package application;

public class Goal {
    public Team team;
    public Player player;
    public double scoredTime;

    public void printGoal() {
        System.out.println("Goal scored after " + scoredTime + " mins by "+ player.name +" of the "+ team.nameTeam);
    }
}
