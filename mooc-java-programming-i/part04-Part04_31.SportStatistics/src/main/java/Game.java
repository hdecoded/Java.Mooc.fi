public class Game {
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPoints;
    private int visitingTeamPoints;

    public Game(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeamPoints = visitingTeamPoints;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getVisitingTeam() {
        return visitingTeam;
    }

    public boolean winnerIs(String teamName) {
        if (homeTeam.equals(teamName) && homeTeamPoints > visitingTeamPoints) {
            return true;
        } else if (visitingTeam.equals(teamName) && visitingTeamPoints > homeTeamPoints) {
            return true;
        } else {
            return false;
        }
    }
}
