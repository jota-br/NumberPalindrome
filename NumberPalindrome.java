public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reversed = 0, lastDigit;
        final int myNumber = number;

        do {
            lastDigit = number % 10;
            number = number / 10;

            if(reversed != myNumber) {
                reversed *= 10;
            }

            reversed += lastDigit;

        } while(number != 0);
        System.out.println(reversed);
        if(reversed == myNumber) {
            return true;
        }

        return false;
    }
}