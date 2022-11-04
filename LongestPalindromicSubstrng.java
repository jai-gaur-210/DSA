public class LongestPalindromicSubstrng {    
    public Boolean palindrome(String s){
        int l=0; int h =s.length()-1;
        while(l<=h){
            if(s.charAt(l)==s.charAt(h)){
                l++; h--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    
    int x=0;
    String p="";
    public String longestPalindrome(String s) {   
        int k=s.length();
        while(k>0){
            for(int i=0; i<s.length()-k+1; i++){
                    Boolean ans = palindrome(s.substring(i, i+k));
                    if(ans == true){
                        p=s.substring(i, i+k);
                        break;
                    }    
            }
            if(p.length()!=0){
                break;
            } 
            k--;
        }      
        return p;
    }
    public static void main(String[] args) {
        String s = "babad";
        LongestPalindromicSubstrng a = new LongestPalindromicSubstrng();
        String ans = a.longestPalindrome(s);
        System.out.println(ans);
    }
}
