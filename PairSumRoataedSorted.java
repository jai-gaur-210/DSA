public class PairSumRoataedSorted {
    public boolean findPairSum(int[] arr, int k) {
        int n=arr.length;
        int l = 0; int h = arr.length-1;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                h=i;
                l=i+1;
            }
        }
        int arr1[] = new int[n];
        int p=0;
        while(l<n){    
            arr1[p] = arr[l];
            l++;p++;
        }
        int m =n-1;
        while(h>=0){
            arr1[m] = arr[h];
            h--;m--;
        }
        
        l=0;h=n-1;
        while(l<h){
            int s =0;
            s += arr1[l]+arr1[h];
            
            if(s==k){
                return true;
            }
            else if(s<k){
                l++;
            }
            else if(s>k){
                h--;
            }
        }
        return false;
	}
    public static void main(String[] args) {
        int arr[]= {5,7,9,1,3};
        int k = 4;
        PairSumRoataedSorted a = new PairSumRoataedSorted();
        boolean ans = a.findPairSum(arr, k);
        System.out.println(ans);
    }
}
