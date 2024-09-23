public class MaxOccuring {
    public char maxOcurringChar(String str) {
        int[] freq = new int[256];  // Array to store frequency of each character (ASCII)
        int maxOccurence = 0;
        char maxChar = ' ';

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
            if (freq[str.charAt(i)] > maxOccurence) {
                maxOccurence = freq[str.charAt(i)];
                maxChar = str.charAt(i);
            }
        }

        return maxChar;
    }

}
