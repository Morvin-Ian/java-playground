public class RepeatedChar {

    public boolean hasRepeatedChar(String str) {

        for(int x = 0; x < (str.length() - 1); x++){
            for(int y = (x + 1); y < (str.length() - 1); y++){
                if(str.charAt(x) == str.charAt(y)){
                    return true;
                }
            }
        }
        return false;
    }
}
