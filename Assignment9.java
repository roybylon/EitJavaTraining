//Question 9
// Authour: Akem Icho
public class Assignment9{
    public static void main(String[] args) {
        // for loop to loop through 1 to 100
       for(int i=1; i <= 100; i++){
        // if condition to check if a number can be divided by 2,5,6and 10
           if (i%2 ==0){
               System.out.println(i);
            }else if (i%5 ==0){
            System.out.println(i);
            }else if (i%6 ==0){
            System.out.println(i);
            }else if (i%10 ==0){
                System.out.println(i);
            }
       }
    }
}