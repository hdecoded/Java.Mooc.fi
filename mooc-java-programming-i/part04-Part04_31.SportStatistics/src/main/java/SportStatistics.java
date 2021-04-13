import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String fileName = scan.nextLine();

        ArrayList<Game> games = readDataFromFile(fileName);

        System.out.println("Team: ");
        String teamName = scan.nextLine();
        int noOfGames = getGamesPlayed(games, teamName);
        System.out.println("Games: " + noOfGames);

        int wins = 0;
        for (Game game : games) {
            if (game.winnerIs(teamName)){
                wins++;
            }

        }

        int losses = noOfGames - wins;

        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }


    private static int getGamesPlayed(ArrayList<Game> games, String teamName) {
        int gameCounter = 0;
        for (Game game : games) {
            if (game.getHomeTeam().equals(teamName) || game.getVisitingTeam().equals(teamName)) {
                gameCounter++;
            }
        }
        return gameCounter;
    }


    private static ArrayList<Game> readDataFromFile(String fileName) {
        ArrayList<Game> games = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] pieces = line.split(",");
                String homeTeam = pieces[0];
                String visitingTeam = pieces[1];
                int homeTeamPoints = Integer.parseInt(pieces[2]);
                int visitingTeamPoints = Integer.parseInt(pieces[3]);
                games.add(new Game(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));
            }

        } catch (IOException e) {
            System.out.println(fileName + " not found");
        }

        return games;
    }

}
