import java.util.Scanner;

public class Quest26 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("How many number do you want to enter? ");
        int number = console.nextInt();
        System.out.println("Number 1: ");
        int firstNum = console.nextInt();
        int min = firstNum;
        int max = firstNum;

        for (int i = 2; i <= number; i++) {
            System.out.println("Number " + i + ":");
            int num = console.nextInt();
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
