import java.util.*;

class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hash_set = new HashSet<Integer>();
        for(int i:nums){
            hash_set.add(i);
        }
        if((hash_set.size() == nums.length)){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        containsDuplicate a = new containsDuplicate();
        boolean ans = a.containsDuplicate(arr);
        System.out.println(ans);
    } 
}