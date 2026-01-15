import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine().replaceAll("\\s+", "").toLowerCase(); // remove space, lowercase

        int[] freq = new int[26]; // for 'a' to 'z'

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                freq[ch - 'a']++; // increment frequency
            }
        }

        System.out.println("\nCharacter Frequency:");
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i + 'A') + ": " + freq[i]); // print in UPPERCASE
            }
        }

        sc.close();
    }
}
