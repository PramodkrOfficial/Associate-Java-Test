class MostVowelsFinder {

    // Method to count vowels in a given string
    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    // Main method to find the string with the most vowels
    public static void main(String[] args) {


        // Sample array of strings
        String[] words = {"Sunshine", "Umbrella", "Major", "Resourceful"};

        String stringWithMostVowels = "";
        int maxVowelCount = 0;

        for (String word : words) {
            int vowelCount = countVowels(word);
            if (vowelCount > maxVowelCount) {
                maxVowelCount = vowelCount;
                stringWithMostVowels = word;
            }
        }

        System.out.println("String with the most vowels: " + stringWithMostVowels);
    }
}

