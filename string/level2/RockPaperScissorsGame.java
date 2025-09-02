import java.util.Scanner;

public class RockPaperScissorsGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of games you want to play: ");
        int numGames = scanner.nextInt();
        scanner.nextLine(); 

        
        String[][] gameResults = new String[numGames][4]; 
        int userWins = 0, computerWins = 0, ties = 0;

       
        for (int i = 0; i < numGames; i++) {
            System.out.print("\nRound " + (i + 1) + " - Enter your choice (rock, paper, or scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();

           
            while (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.print("Invalid input. Please enter rock, paper, or scissors: ");
                userChoice = scanner.nextLine().toLowerCase();
            }

            String computerChoice = getComputerChoice();
            String winner = determineWinner(userChoice, computerChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
            else ties++;

            gameResults[i][0] = String.valueOf(i + 1);
            gameResults[i][1] = userChoice;
            gameResults[i][2] = computerChoice;
            gameResults[i][3] = winner;
        }
        String[][] stats = calculateStatistics(numGames, userWins, computerWins, ties);
        displayResults(gameResults, stats);

        scanner.close();
    }
    public static String getComputerChoice() {
        double rand = Math.random();
        if (rand < 0.33) return "rock";
        else if (rand < 0.66) return "paper";
        else return "scissors";
    }
    public static String determineWinner(String user, String computer) {
        if (user.equals(computer)) return "Tie";

        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    public static String[][] calculateStatistics(int totalGames, int userWins, int computerWins, int ties) {
        String[][] stats = new String[3][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf((int)((userWins * 100.0) / totalGames)) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.valueOf((int)((computerWins * 100.0) / totalGames)) + "%";

        stats[2][0] = "Ties";
        stats[2][1] = String.valueOf(ties);
        stats[2][2] = String.valueOf((int)((ties * 100.0) / totalGames)) + "%";

        return stats;
    }
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\n--- Game Results ---");
        System.out.println("Game#\tPlayer\t\tComputer\tWinner");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < gameResults.length; i++) {
            System.out.println(gameResults[i][0] + "\t" +
                               gameResults[i][1] + "\t\t" +
                               gameResults[i][2] + "\t\t" +
                               gameResults[i][3]);
        }

        System.out.println("\n--- Summary Statistics ---");
        System.out.println("Player\t\tWins\t\tWin %");
        System.out.println("----------------------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t\t" + stats[i][1] + "\t\t" + stats[i][2]);
        }
    }
}
