import java.util.Scanner;
public class BBSortUI{
    
    public static final Scanner sc = new Scanner(System.in);
    private int arr[];

    int[] getArr() {
        return arr;
    }

    int lengArr(){
        return arr.length;
    }


    public Integer checkIn(String inputVal){
        int kq = 0;
        while (true){
            try {
                kq = (int) Integer.parseInt(inputVal);
                if (kq<0) return null;
                else return kq;
            } catch (Exception e) {
                return null;
            }
        }
    }

     public int inputNumber(){
        int num;
        while (true){
            try {
                num = checkIn(sc.nextLine()).intValue();
                return num;
            } catch (NullPointerException e ) {
                System.out.println("Please input numberand number is greater than zero");
                System.out.print("Please choice one option: ");
            }

        }
    }
     public int menu(){
        System.out.print("========= Bubble Sort program =========\n"+
                            "1. Input Element\n" +
                            "2. Sort Ascending\n" +
                            "3. Sort Descending\n" +
                            "4. Exit\n" +
                            "Please choice one option: "
        );
        while (true) {
            try {
                int choice = sc.nextInt();
                return choice;
            } catch (Exception e) {
                System.out.print("Please choice one option: ");
                sc.nextLine();
            }
        }   
        
    }

    //Sort T
    public  int partitionT(int arr[], int l, int r){
        int i = l, j = r;
        int tmp;
        int pivot = arr[(l+r)/2];
        while (i<=j){
            while (arr[i]<pivot) i++;
            while (arr[j]>pivot) j--;
            if (i<=j){
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }

    public  void sortT(int arr[], int l, int r){
        if (l<r){
            int pi = partitionT(arr, l, r);
            sortT(arr, l, pi-1);
            sortT(arr, pi, r);
        }
    }


    //Sort G
    public  int partitionG(int arr[], int l, int r){
        int i = l, j = r;
        int tmp;
        int pivot = arr[(l+r)/2];
        while (i<=j){
            while (arr[i]<pivot) i++;
            while (arr[j]>pivot) j--;
            if (i<=j){
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }

    public  void sortG(int arr[], int l, int r){
        if (l<r){
            int pi = partitionT(arr, l, r);
            sortG(arr, l, pi-1);
            sortG(arr, pi, r);
        }
    }
    //method

    public int[] InputE(){
        System.out.println(
        "----- Input Element -----\n"+
        "Input Length Of Array");
        System.out.print("Enter Number: ");
        sc.nextLine();
        int n = inputNumber();
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Enter number " + (i+1) + " : ");
            arr[i] = inputNumber();
        }
        this.arr = arr;
        return arr;
    }

    public  void displayT(int[] arr){
        System.out.println("----- Ascending -----");
        for(int i=0; i<arr.length-1; i++){
            System.out.print("[" +  arr[i] +"]->");
        }
        System.out.println("["+arr[arr.length-1] +"]");
    }

    public  void displayG(int[] arr){
        System.out.println("----- Ascending -----");
        for(int i=0; i<arr.length-1; i++){
            System.out.print("[" +  arr[i] +"]<-");
        }
        System.out.println("["+arr[arr.length-1] +"]");
    }

    public  int[] sortAscending(int[] arrayNeedSort){
        sortT(arrayNeedSort, 0, arrayNeedSort.length-1);
        displayT(arrayNeedSort);
        return arrayNeedSort;
    }

    public  int[] sortDescending(int[] arrayNeedSort){
        sortG(arrayNeedSort, 0, arrayNeedSort.length-1);
        displayG(arrayNeedSort);
        return arrayNeedSort;
    }
}