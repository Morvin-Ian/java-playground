import java.util.ArrayList;

public class Capitalize {

    public String call(String sentence){
        String[] sentenceArr = sentence.split("\\s");
        ArrayList<String> capitalized = new ArrayList<String>();

        for (String arr: sentenceArr){
            String newStr = Character.toUpperCase(arr.charAt(0))+ arr.substring(1);
            capitalized.add(newStr);
        }
        return String.join(" ", capitalized);
    }
}
