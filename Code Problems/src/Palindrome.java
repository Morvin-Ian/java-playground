public class Palindrome {

    public boolean isPalindrome(int value){
            var reverseNumber = 0;
            var temp = value;

            while (temp > 0) {
                int remainder = temp % 10;
                reverseNumber = (reverseNumber * 10) + remainder;
                temp /= 10;
            }
            return value == reverseNumber;
        }
}

