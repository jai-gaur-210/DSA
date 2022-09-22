class TrappinRainWater
{  
    public int trap(int[] nums) {
        int sum =0;
        int n = nums.length;
        int a[] = new int[n];
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max1 = Math.max(max1 , nums[i]);
            a[i] = max1;
        }
        for(int i=n-1; i>=0; i--){
            max2= Math.max(max2,nums[i]);
            a[i] = Integer.min(a[i], max2);
        }
        for(int i=0; i<n; i++){
            if(a[i]>nums[i]){
                sum += a[i]-nums[i]; 
            }
        }
        return(sum);
    }            
    public static void main (String[] args){
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        TrappinRainWater a = new TrappinRainWater();
        int ans = a.trap(arr);
        System.out.println(ans);   
    }     
}
