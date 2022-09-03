import java.io.*;
import java.util.*;
class RotatedArray
{  
    public int search(int[] nums, int target) {      
        int start=0,end=nums.length-1;       
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target==nums[mid])
            {
                return mid;
            }            
            else if(nums[start]<=nums[mid])
            {               
                if(target>=nums[start] && target<nums[mid])
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }			
            else
            {
                if(target>nums[mid] && target<=nums[end])
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
        }
        return -1;
    }   
    public static void main (String[] args)
    {
        int arr[] = {4,5,6,7,0,1,2};
        RotatedArray a = new RotatedArray();
        int ans = a.search(arr , 2);
        System.out.println(ans);   
    }    
}

