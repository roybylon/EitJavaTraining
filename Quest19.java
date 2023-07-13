//Question 19
// Authour By Bolaji Hammed

/* Write a method called number_of_factors that takes an integer and returns how
 many factors the number has. */


// importing the Scanner object for the input
import java.util.Scanner;   
public class Quest19{
     static void number_of_factors(int num){
         int i;
         for(i = 1; i<=num; ++i){
             if(num % i == 0){
        
                 System.out.print(i + " ");
             }
         }
     }
     public static void main(String []args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your number : ");
        int number = input.nextInt();
        System.out.print("Factor of " +number+ " is : ");
        number_of_factors(number);
     }
}