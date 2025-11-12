import java.util.*;

// Team class with Comparable for sorting by points (descending)
class Team implements Comparable<Team> {
    String name;
    int points;

    Team(String name) {
        this.name = name;
        this.points = 0;
    }

    public void addPoints(int p) {
        this.points += p;
    }

    @Override
    public int compareTo(Team t) {
        return Integer.compare(t.points, this.points); // Sort by points descending
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Team && ((Team) o).name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name + " (" + points + " pts)";
    }
}

// Match class
class Match {
    Team team1;
    Team team2;

    Match(Team t1, Team t2) {
        this.team1 = t1;
        this.team2 = t2;
    }

    @Override
    public String toString() {
        return team1.name + " vs " + team2.name;
    }
}

// Result class
class Result {
    Match match;
    String winner;

    Result(Match match, String winner) {
        this.match = match;
        this.winner = winner;
    }

    @Override
    public String toString() {
        return match + " → Winner: " + winner;
    }
}

public class SportsTournamentScheduler {
    public static void main(String[] args) {
        // Step 1: Register Teams
        Set<Team> registeredTeams = new HashSet<>(Arrays.asList(
            new Team("Lions"),
            new Team("Tigers"),
            new Team("Bulls"),
            new Team("Eagles")
        ));

        System.out.println("Registered Teams:");
        for (Team t : registeredTeams) System.out.println("- " + t.name);

        // Step 2: Schedule Matches
        Queue<Match> matchQueue = new LinkedList<>();
        List<Team> teamList = new ArrayList<>(registeredTeams);
        for (int i = 0; i < teamList.size(); i++) {
            for (int j = i + 1; j < teamList.size(); j++) {
                matchQueue.add(new Match(teamList.get(i), teamList.get(j)));
            }
        }

        // Step 3: Process Matches and Record Results
        List<Result> results = new ArrayList<>();
        Random random = new Random();
        System.out.println("\nMatch Results:");
        while (!matchQueue.isEmpty()) {
            Match m = matchQueue.poll();
            Team winner = random.nextBoolean() ? m.team1 : m.team2;
            winner.addPoints(3); // 3 points for win
            results.add(new Result(m, winner.name));
            System.out.println(m + " → Winner: " + winner.name);
        }

        // Step 4: Display Leaderboard (Sorted by Points)
        TreeSet<Team> leaderboard = new TreeSet<>(registeredTeams);

        System.out.println("\n🏆 Final Leaderboard:");
        for (Team t : leaderboard) System.out.println(t);

        System.out.println("\nAll Match Results:");
        for (Result r : results) System.out.println(r);
    }
}
