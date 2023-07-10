//Question 19
// Authour By Bolaji Hammed

/* Write a method called number_of_factors that takes an integer and returns how
 many factors the number has. */


/* Online Java Compiler and Editor */
import java.util.Scanner;   // importing the Scanner object for the input
public class Quest19{
     static void number_of_factors(int num){
         int i;
         for(i = 1; i<=num; ++i){
             if(num % i == 0){
                //  System.out.print("Factor of " +num+ " is "+ i);
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