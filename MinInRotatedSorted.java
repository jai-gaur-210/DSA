public class MinInRotatedSorted {
    public int findMin(int[] nums) {
        int l = 0; int h =nums.length-1; 
        int min = Integer.MAX_VALUE;
        while(l<=h){
            int mid= (l+h)/2;
            min = Math.min(min, nums[mid]);
            if(nums[l]<=nums[mid]){
                min = Math.min(min ,nums[l]);
                l = mid+1;
            }
            else{
                min = Math.min(min,nums[mid+1]);
                h= mid-1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = { 3,4,5,1,2 };
        MinInRotatedSorted a = new MinInRotatedSorted();
        int ans = a.findMin(arr);
        System.out.println(ans);
    }
}
