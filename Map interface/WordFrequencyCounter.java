import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String filePath = "input.txt";
        HashMap<String, Integer> wordCount = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = br.readLine()) != null) {
                line = line.toLowerCase().replaceAll("[^a-z0-9 ]", " ");
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.length() == 0) continue;
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
