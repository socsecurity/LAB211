public class J1_S_P0004{

    public static final int MAX_RANDOM = 20;
    public static final int MIN_RANDOM = 0;
    public static void main(String args[]) { 
        int n = MAX_RANDOM; 
        int arr[] = new int[n]; 
        
        for (int i = 0; i<n; i++){
            int random_int = (int)(Math.random() * (MAX_RANDOM - (MIN_RANDOM)) + (MIN_RANDOM));            
            arr[i] = random_int;
        }
        
        QSort s = new QSort(); 
        System.out.println("Chua Sort: ");
        s.printArray(arr);
        s.sort(arr, 0, n-1); 
        System.out.println("Sort roi: ");
        s.printArray(arr); 
    } 
}