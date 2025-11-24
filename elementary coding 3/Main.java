public class Main {

    public static String identifyPossibleWords(String input1, String input2) {
        String incomplete = input1.toLowerCase();
        String[] words = input2.split(":");

        int underscoreIndex = incomplete.indexOf('_');
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String lowerWord = word.toLowerCase();

            // lengths must match
            if (lowerWord.length() != incomplete.length()) {
                continue;
            }

            boolean match = true;
            for (int i = 0; i < incomplete.length(); i++) {
                if (i == underscoreIndex) continue;

                if (incomplete.charAt(i) != lowerWord.charAt(i)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                if (result.length() > 0) result.append(":");
                result.append(word.toUpperCase());
            }
        }

        if (result.length() == 0) {
            return "ERROR-009";
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input1 = "Fi_er";
        String input2 = "Fever:filer:Filter:Fixer:fiber:fibretailor:offer";

        System.out.println(identifyPossibleWords(input1, input2)); 
        // Output: FILER:FIXER:FIBER
    }
}
