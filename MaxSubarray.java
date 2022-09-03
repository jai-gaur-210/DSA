import java.io.*;
import java.util.*;
class MaxSubArray
{  
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max =0;
        int global = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(nums[i] , nums[i]+max);
            if(max>global){
                global = max;
            }
        }
        return global;
    }            
    public static void main (String[] args){
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        MaxSubArray a = new MaxSubArray();
        int ans = a.maxSubArray(arr);
        System.out.println(ans);   
    }     
}