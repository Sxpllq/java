package n12;

import java.util.Scanner;

public class PrintOddNumbers {

    public static void printOdds() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num == 0) {
            return;
        }

        if (num % 2 != 0) {
            System.out.println(num);
        }

        printOdds();
    }

    public static void main(String[] args) {
        printOdds();
    }
}
