import java.util.HashSet;
public class LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        int a=0; int b=0;
        int max =0;
        HashSet<Character> h = new HashSet<>();
        while(b<s.length()){
            if(!h.contains(s.charAt(b))){
                h.add(s.charAt(b));
                b++;
                max = Math.max(max , h.size());
            }
            else{
                h.remove(s.charAt(a));
                a++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "ohvhjdml";
        LongestSubstringWithoutRepeating a =new LongestSubstringWithoutRepeating();
        int ans=a.lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
}
