import java.util.Scanner;
public class J1_S_P0001{
    public static final Scanner sc = new Scanner(System.in);
    public static final int MAX_RANDOM = 6;
    public static final int MIN_RANDOM = 1;
    public static void main(String[] args) {
        System.out.println("Enter number of array: ");
        int n=0; 
        try {
            n = sc.nextInt();
        } catch (Exception e) { 
            System.out.print("Input again: ");
        }

        int arr[] = new int[n]; 
        
        for (int i = 0; i<n; i++){
            int random_int = (int)(Math.random() * (n - (MIN_RANDOM)) + (MIN_RANDOM));            
            arr[i] = random_int;
        }        
        BBSort s = new BBSort();        
        System.out.print("Unsorted array:");  
        s.printArray(arr);
        System.out.print("Sorted array:");  
        s.printArray(s.bubbleSort(arr)); 
    }
}