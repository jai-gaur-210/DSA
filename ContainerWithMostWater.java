public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int n= height.length;
        int max = Integer.MIN_VALUE;
        int l=0; int h=n-1;
        while(l<h){
            int min = Integer.MAX_VALUE;
            min =Math.min(height[l],height[h]);
            int ans = min*(h-l);
            max = Math.max(max , ans);
            if(height[l]<height[h]){
                l++;
            }
            else{
                h--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater a = new ContainerWithMostWater();
        int ans = a.maxArea(arr);
        System.out.println(ans); 
    }  
}
