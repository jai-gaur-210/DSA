
import java.util.*;


public class groupAnagrams {
    public ArrayList<ArrayList<String>> groupAnagram(String[] strs) {
        ArrayList<ArrayList<String>> lst = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] as=strs[i].toCharArray(); 
            Arrays.sort(as);
            String s = new String(as);
            
            if(!map.containsKey(s)){
                ArrayList<String> a1 = new ArrayList<>();
                a1.add(strs[i]);
                map.put(s , a1);
            }
            else{
                map.get(s).add(strs[i]);
            }
        }
        for( ArrayList<String> val : map.values()){
            lst.add(val);
        }
        return(lst);
    }
    public static void main(String[] args) {
        String arr[] = {"eat","tea","tan","ate","nat","bat"};
        groupAnagrams a = new groupAnagrams();
        ArrayList<ArrayList<String>> lst = a.groupAnagram(arr);
        System.out.println(lst);
    }
}
