package n10;

public class ReverseNumber {

    public static int reverse(int n) {
        return reverseHelper(n, 0);
    }

    private static int reverseHelper(int n, int result) {
        if (n == 0) {
            return result;
        }
        return reverseHelper(n / 10, result * 10 + n % 10);
    }

    public static void main(String[] args) {
        int n = 12345;
        int reversed = reverse(n);
        System.out.println("Reversed number: " + reversed);
    }
}
