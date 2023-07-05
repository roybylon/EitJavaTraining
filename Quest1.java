//Question 1
// Authour By Bolaji Hammed

import java.util.Scanner; // importing the Scanner object for the input
public class Quest1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // initialising a scanner instance for input
        
        System.out.print("Enter your weight : ");
        int weight = input.nextInt();
        final float pounds = 2.2f; // using final for Constant pounds 
        float weightInPounds = pounds * weight; 
        
        System.out.format("Your weight in pounds is : %.1f ", weightInPounds); // format was use to round the weightInPounds to the nearest tenth 
    }
    
    
}