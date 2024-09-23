import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String word1, String word2) {
        char[] ArrayW1 = word1.toLowerCase().toCharArray();
        char[] ArrayW2 = word2.toLowerCase().toCharArray();
        Arrays.sort(ArrayW1);
        Arrays.sort(ArrayW2);
        return Arrays.equals(ArrayW1, ArrayW2);
    }
}

