public class ReverseString {
    public String reverse(String word){
        String reversedString = "";

        for(int x = 0; x < word.length(); x++){
            reversedString = word.charAt(x) + reversedString;
        }
        return reversedString;
    }
}
