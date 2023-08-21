//Question 3
// Authour By Bolaji Hammed
import java.util.Scanner;
public class Quest3{

     public static void main(String []args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your number x : ");
        float x = input.nextFloat();
        System.out.print("Enter your number y : ");
        float y = input.nextFloat();
        float total = (x-y)/(x+y);
        // System.out.println("The value of "+ x + " - "+ y +" / " + x +" + " + y +" is " +total);
        System.out.format("The value of %.0f - %.0f / %.0f + %.0f is : %.2f", x, y, x, y, total);
     }
}