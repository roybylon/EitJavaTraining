//Question 25
// Authour By Bolaji Hammed

// Write a program calculates the grade point of the users, where the program
// prompts user for the number of courses they are doing, their score in each course and
// unit of each course, then generates a perfect grade point of the user. N.B., use the school
// Grade Point (GP) system.   ol

//GPA = (Sum of grade + course units obtained) / Sum of course units taken


import java.util.Scanner;
// We declare Reference class to store our global variable totalGrade since java didn't fully support global variable
class Reference {
   public static float totalGrade = 0;
   public static int totalUnit = 0;
}
public class Quest25{
    static void gradeCheck(int num, int unit){
        Quest25 grade = new Quest25();
        if(num < 40){
            Reference.totalGrade+= 0 * unit;
            Reference.totalUnit += unit;
        } else if (num >= 40 && num < 45) {
            Reference.totalGrade+= 2.00 * unit;
            Reference.totalUnit += unit;
        } else if (num >= 45 && num < 50) {
            Reference.totalGrade+= 2.25 * unit;
            Reference.totalUnit += unit;
        } else if (num >= 50 && num < 55) {
            Reference.totalGrade+= 2.50 * unit;
            Reference.totalUnit += unit;
        } else if (num >= 55 && num < 60) {
            Reference.totalGrade+= 2.75 * unit;
            Reference.totalUnit += unit;
        } else if (num >= 60 && num < 65) {
            Reference.totalGrade+= 3.00 * unit;
            Reference.totalUnit += unit;
        } else if (num >= 65 && num < 70) {
            Reference.totalGrade+= 3.25 * unit;
            Reference.totalUnit += unit;
        } else if (num >= 70 && num < 75) {
            Reference.totalGrade+= 3.50 * unit;
            Reference.totalUnit += unit;
        } else if (num >= 75 && num <= 100) {
            Reference.totalGrade+= 4.00 * unit;
            Reference.totalUnit += unit;
        } else if (num > 100) {
            System.out.println("Score must not more than 100");
        } else {
            System.out.println("Enter a vallid score ");
        }
        
    }
    
     public static void main(String []args){
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter your Total Course : ");
        int totalCourse = input.nextInt();
        int dupTotalCourse = totalCourse;
        
        int sum = 0;
        while(totalCourse!=0){
            Scanner course_input = new Scanner(System.in);
            System.out.print("Enter your Course name : ");
            String courseName = course_input.nextLine();
            System.out.print("Enter your score for " + courseName+ " : " );
            int courseScore = course_input.nextInt();
            System.out.print("Enter unit course for " + courseName+ " : " );
            int unitCourse = course_input.nextInt();
            gradeCheck(courseScore, unitCourse);
            totalCourse--;

        }
        // System.out.println("Your Total Grade Point is : " + Reference.totalGrade/Reference.totalUnit);
        // Convert it to 2 decimal places using format
        System.out.format("Your Total Grade Point is : %.2f ", Reference.totalGrade/Reference.totalUnit);

     }
}