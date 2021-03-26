public class BiSearch{
    int binarySearch(int arr[], int l, int r, int x) { 
        if (r >= l) { 
            int mid = (l + r) / 2; 
            if (arr[mid] == x) return mid; 
            if (arr[mid] > x) return binarySearch(arr, l, mid - 1, x); 
            return binarySearch(arr, mid + 1, r, x); 
        }
        return -1; 
    }
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
        System.out.print("["); 
        for (int i=0; i<n-1; ++i) 
            System.out.print(arr[i]+", "); 
        System.out.println(arr[n-1]+"]"); 
    }

    public void sort(int arr[], int l, int r){
        if (l<r){
            int pi = partition(arr, l, r);
            sort(arr, l, pi-1);
            sort(arr, pi, r);
        }
    }
}