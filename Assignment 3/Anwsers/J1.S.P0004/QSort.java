public class QSort{
    int partition(int arr[], int l, int r){
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

    public void printArray(int arr[]) { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    }

    public void sort(int arr[], int l, int r){
        if (l<r){
            int pi = partition(arr, l, r);
            sort(arr, l, pi-1);
            sort(arr, pi, r);
        }
    }
}