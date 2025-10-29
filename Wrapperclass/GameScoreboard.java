public class GameScoreboard {
    public static void main(String[] args) {
        Integer[] scores = {50, null, 70, 85, null, 40};
        int totalScore = 0;
        int notPlayedCount = 0;

        for (Integer score : scores) {
            if (score == null) {
                notPlayedCount++;
            } else {
                totalScore += score;
            }
        }

        System.out.println("Number of players who haven't played: " + notPlayedCount);
        System.out.println("Total of valid scores: " + totalScore);
    }
}
