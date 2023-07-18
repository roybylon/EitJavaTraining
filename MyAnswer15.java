public class MyAnswer15 {
    public static int numUnique(int a, int b, int c) {
        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;


        int uniques = 0;
        for (int s = 0; s < arr.length; s++) {
            for (int t = s + 1; t < arr.length; t++) {
                if (t != s && arr[t] != arr[s])
                uniques++;
            }
        }

        return uniques;


    }

    public static void main(String[] args) {
        System.out.println("number of unique are; " + numUnique(5, 15, 21));
        
    }
    
}
