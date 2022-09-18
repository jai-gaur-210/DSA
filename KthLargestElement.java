public class KthLargestElement {
    public int partition(int[] arr, int low,int high)
    {
        int pivot = arr[high], pivotloc = low;
        for (int i = low; i <= high; i++) {

            if (arr[i] < pivot) {
                int temp = arr[i];
                arr[i] = arr[pivotloc];
                arr[pivotloc] = temp;
                pivotloc++;
            }
        }
        int temp = arr[high];
        arr[high] = arr[pivotloc];
        arr[pivotloc] = temp; 
        return pivotloc;
    }
    public int kthLargest(int[] arr, int low,int high, int k)
    {
        int partition = partition(arr, low, high);
        if (partition == k - 1)
            return arr[partition];
        else if (partition < k - 1)
            return kthLargest(arr, partition + 1, high, k);
        else
            return kthLargest(arr, low, partition - 1, k);
    }
    
    public static void main (String[] args){
        int arr[] = {3,2,1,5,6,4};
        int l = arr.length;
        KthLargestElement a = new KthLargestElement();
        int ans = a.kthLargest(arr, 0 , arr.length-1 , l-2);
        System.out.println(ans);   
    } 
}
