

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int arr1[] = new int[nums.length];
        int arr2[] = new int[nums.length];
        int ans[] = new int[nums.length];
        int t=1;
        int p=1;
        arr1[0] =1;
        for(int i=1; i<nums.length; i++){
            t = nums[i-1]*t;
            arr1[i] = t;
        }
        arr2[arr2.length-1] = 1;
        for(int i=arr2.length-2; i>=0; i--){
            p = nums[i+1]*p;
            arr2[i] = p;
        }
        
        for(int i=0; i<ans.length; i++){
            ans[i] = arr1[i]*arr2[i];
        }
        System.out.println(t);
        return(ans);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        ProductOfArrayExceptSelf a = new ProductOfArrayExceptSelf();
        int []ans = a.productExceptSelf(arr);
        for(int  i=0; i<ans.length; i++){
            System.out.print(ans[i]);
        }
        
    }
}
