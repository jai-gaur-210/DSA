import java.util.HashMap;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> h = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int x = target - nums[i];
            if(h.containsKey(x)){
                int ans [] = {h.get(x) , i};
                return ans;
            }
            else{
                h.put(nums[i] , i);
            }
        }

        return null;
    }
}
 // 2 10 2 7   ,9