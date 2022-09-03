//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class Chocolate
{
    public static void main (String[] args)
    {       
        Scanner sc = new Scanner(System.in);        
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0;i<n;i++)
                {
                    int x = sc.nextInt();
                    arr.add(x);
                }
            int m = sc.nextInt();           
            Solution ob = new Solution();            
    		System.out.println(ob.findMinDiff(arr,n,m));    
    }
}
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        int x=m-1;
        int result = Integer.MAX_VALUE;
        Collections.sort(a);      
        for(int i =0; i<n-m+1; i++){
            int y = a.get(x) - a.get(i);
            result = Math.min(result , y);
            x++;
        }       
        return result;
    }
}













