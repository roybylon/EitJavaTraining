import java.util.Scanner;

public class Quest6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = 0;
        double max = 0;
        double min = 0;
        System.out.println("Enter seven number: ");
        for (a = 0; a < 10; a++) {
            a = scan.nextDouble();

            if (a == 0) {
                min = a;
                max = a;
            } else if (a < min) {
                min = a;
            } else if (a > max) {
                max = a;
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
