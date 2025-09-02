import java.util.*;
public class cards {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
                          "Jack", "Queen", "King", "Ace"};

        int numOfCards = suits.length * ranks.length;

      
        String[] deck = initializeDeck(suits, ranks);

        
        deck = shuffleDeck(deck);

      
        System.out.print("Enter number of players: ");
        int playersCount = scanner.nextInt();

        System.out.print("Enter number of cards to distribute to each player: ");
        int cardsPerPlayer = scanner.nextInt();

        
        if (playersCount * cardsPerPlayer > numOfCards) {
            System.out.println("Not enough cards to distribute " + cardsPerPlayer + " cards to " + playersCount + " players.");
            scanner.close();
            return;
        }

      
        String[][] playersCards = distributeCards(deck, playersCount, cardsPerPlayer);

      
        printPlayersCards(playersCards);

        scanner.close();
    }
    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int n = suits.length * ranks.length;
        String[] deck = new String[n];
        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }
        return deck;
    }
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }
    public static String[][] distributeCards(String[] deck, int playersCount, int cardsPerPlayer) {
        String[][] playersCards = new String[playersCount][cardsPerPlayer];
        int index = 0;
        for (int card = 0; card < cardsPerPlayer; card++) {
            for (int player = 0; player < playersCount; player++) {
                playersCards[player][card] = deck[index];
                index++;
            }
        }
        return playersCards;
    }
    public static void printPlayersCards(String[][] playersCards) {
        for (int player = 0; player < playersCards.length; player++) {
            System.out.println("\nPlayer " + (player + 1) + "'s cards:");
            for (int card = 0; card < playersCards[player].length; card++) {
                System.out.println("  " + playersCards[player][card]);
            }
        }
    }
}
