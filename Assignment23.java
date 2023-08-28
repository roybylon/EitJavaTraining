//Question 23
// Authour: Akem Icho
// This question delaped the submition of this assignment as am not still to solve. 
public class Assignment23 {
    

    
        String name = "apple";
        int amount = 20;
        float price = 120;
        float discount;
    public void get_price(){
        if(amount < 10){
            discount = price * 1;
        }else if(amount > 10){
            discount = price * 10 * 1 / 100;
            // price = price - discount;
        }else if(amount >= 100){
            discount = price *  20 * 1 / 100;
            // price = price - discount;
        }
        // System.out.println(price);
        System.out.println(discount);
        }
    public void make_purchase(){
        price = price * amount;
        System.out.println(price);
    }
        
    
       
    
    public static void main(String[] args) {
        Assignment23 myPrice = new Assignment23();
       
        myPrice.make_purchase();  myPrice.get_price();
        
        
    }    
    
}
