import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();

        castVote(votes, "Alice");
        castVote(votes, "Bob");
        castVote(votes, "Carol");
        castVote(votes, "Alice");
        castVote(votes, "Bob");
        castVote(votes, "Alice");
        castVote(votes, "Carol");
        castVote(votes, "Bob");
        castVote(votes, "Alice");
        castVote(votes, "Bob");

        System.out.println("Vote Count:");
        for (Map.Entry<String, Integer> e : votes.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }

        String winner = null;
        int max = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> e : votes.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                winner = e.getKey();
            }
        }

        System.out.println("Winner: " + winner);
    }

    static void castVote(Map<String, Integer> map, String candidate) {
        map.put(candidate, map.getOrDefault(candidate, 0) + 1);
    }
}
