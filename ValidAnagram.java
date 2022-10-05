import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int arr[] = new int [26];
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-97]+=1;
        }
        for(int i=0; i<t.length(); i++){
            arr[t.charAt(i)-97]-=1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                return false;    
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "rat"; String t = "car";
        ValidAnagram a =new ValidAnagram();
        Boolean ans=a.isAnagram(s,t);
        System.out.println(ans);
    }
}
