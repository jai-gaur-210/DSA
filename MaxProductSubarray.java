public class MaxProductSubarray {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int prod=1;
        for(int i=0;i<nums.length;i++){
            prod*=nums[i];
            max=Math.max(max,prod);
            if(prod==0){
                prod=1;
            }
        }
        prod=1;
        for(int i=nums.length-1;i>=0;i--){
            prod*=nums[i];
            max=Math.max(max,prod);
            if(prod==0){
                prod=1;
            }
        }
        return max;
    }
    public static void main (String[] args){
        int arr[] = {2,-5,-2,-4,3};
        MaxProductSubarray a = new MaxProductSubarray();
        int ans = a.maxProduct(arr);
        System.out.println(ans);   
    }
}
