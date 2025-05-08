import java.util.Scanner;

class MostVowelsFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array of String words: ");
        String n = input.nextLine();
        String[] words = n.split(" ");
//        String[] words = {"Sunshine", "Umbrella", "Major", "Resourceful"};

        String stringMostVowels = "";
        int maxVowelCount = 0;

        for (String word : words) {
            int vowelCount = countVowels(word);
            if (vowelCount > maxVowelCount) {
                maxVowelCount = vowelCount;
                stringMostVowels = word;
            }
        }
        System.out.println("String with the most vowels: " + stringMostVowels);
    }

    public static int countVowels(String str) {
        int count= 0;
        String vowels = "aeiou";

        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}

