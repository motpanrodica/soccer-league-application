package application;

public class League {
    public static void main(String[] args) {
        Player messi = new Player();
        messi.name = "Messi";
        Player eliot = new Player();
        eliot.name = "Eliot";
        Player george = new Player();
        george.name = "George";
        Player cristian = new Player();
        cristian.name = "Cristian";
        Player robert = new Player();
        robert.name = "Robert";
        Player neymer = new Player();
        neymer.name = "Neymer";


        Player[] redPlayers = {messi, eliot, george};
        Team red = new Team();
        red.nameTeam = "Red";
        red.players = redPlayers;
        red.printRoster();

        Team green = new Team();
        green.nameTeam = "Green";
        green.players = new Player[]{cristian, robert, neymer};
        green.printRoster();

        Game game = new Game();
        game.homeTeam = red;
        game.awayTeam = green;
        game.goals = new Goal[3];

        for (int i = 0; i <= 90; i++) {
            if (i == 10) {

                Goal messiGoal = new Goal();
                messiGoal.team = red;
                messiGoal.player = messi;
                messiGoal.scoredTime = i;
                game.goals[0] = messiGoal;

            } else if (i == 60) {

                Goal georgeGoal = new Goal();
                georgeGoal.team = red;
                georgeGoal.player = george;
                georgeGoal.scoredTime = i;
                game.goals[1] = georgeGoal;

            } else if (i == 80) {
                Goal cristianGoal = new Goal();
                cristianGoal.team = green;
                cristianGoal.player = cristian;
                cristianGoal.scoredTime = i;
                game.goals[2] = cristianGoal;

            }
        }
        game.printGoals();

    }
}
