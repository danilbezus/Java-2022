import java.util.regex.Pattern;

public class Lab3 {
    public static void main(String[] args) {
        /*
        0302
        C3 = 2 -> String
        C17 = 13 ->  В заданому тексті знайти підрядок максимальної довжини,
        що є паліндромом, тобто читається однаково зліва на право та з права на ліво.
        */

        // Текстовий рядок з яким виконують зміни
        String text = "Two households, both alike in dignity,\n" +
                "\n" +
                "In fair Verona, where we lay our scene,\n" +
                "\n" +
                "From ancient grudge break to new mutiny,\n" +
                "\n" +
                "Where civil blood makes civil hands unclean.\n" +
                "\n" +
                "From forth the fatal loins of these two foes\n" +
                "\n" +
                "A pair of star-cross'd lovers take their life;\n" +
                "\n" +
                "Whole misadventured piteous overthrows\n" +
                "\n" +
                "Do with their death bury their parents' strife.\n" +
                "\n" +
                "The fearful passage of their death-mark'd love,\n" +
                "\n" +
                "And the continuance of their parents' rage,\n" +
                "\n" +
                "Which, but their children's end, nought could remove,\n" +
                "\n" +
                "Is now the two hours' traffic of our stage;\n" +
                "\n" +
                "The which if you with patient ears attend,\n" +
                "\n" +
                "What here shall miss, our toil shall strive to mend.";

        System.out.println(longestPalindromeString(text.toLowerCase()));
    }
    static public String intermediatePalindrome(String s, int left, int right) {
        if (left > right) return null;
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    // O(n^2)
    public static String longestPalindromeString(String s) {
        if (s == null) return null;
        String longest = s.substring(0, 1);
        for (int i = 0; i < s.length() - 1; i++) {
            //непарна кількість символів
            String palindrome = intermediatePalindrome(s, i, i);
            if (palindrome.length() > longest.length()) {
                longest = palindrome;
            }
            //парна кількість симвлоів
            palindrome = intermediatePalindrome(s, i, i + 1);
            if (palindrome.length() > longest.length()) {
                longest = palindrome;
            }
        }
        return longest;
    }
}