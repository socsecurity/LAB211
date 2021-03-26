import java.util.Scanner;
public class J1_S_P0006{
    public static final Scanner sc = new Scanner(System.in);    
    public static final int MAX_RANDOM = 10;
    public static final int MIN_RANDOM = 0;
    public static void main(String[] args) {
        
        int x = 0;
        int n=0; 
        System.out.println("Enter number of array: ");
        try {
            n = sc.nextInt();
        } catch (Exception e) { 
            System.out.print("Input again: ");
        }

        System.out.println("Enter search value: ");
        try {
            x = sc.nextInt();
        } catch (Exception e) { 
            System.out.print("Input again: ");
        }

        int arr[] = new int[n]; 
        
        for (int i = 0; i<n; i++){
            int random_int = (int)(Math.random() * (n - (MIN_RANDOM)) + (MIN_RANDOM));            
            arr[i] = random_int;
        }
        
        BiSearch s = new BiSearch(); 
        s.sort(arr, 0, n-1); 
        System.out.print("Sort array: ");
        s.printArray(arr); 

        System.out.println("Found "+ x+ " at index:  " + s.binarySearch(arr, 0, n-1, x));

    }
}