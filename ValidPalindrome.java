class ValidPalindrome{
    public boolean isPalindrome(String s) {
        s =s.replaceAll("[^a-zA-Z]" , "");
        s = s.toLowerCase();
        int l=0; int h=s.length()-1;
        while(l<=h){
            if(s.charAt(l) == s.charAt(h)){
                l++;h--;
            }
            else{
                return false;
            }
        }
        
        return true; 
    }
    public static void main(String[] args) {
        String s = " ";
        ValidPalindrome a =new ValidPalindrome();
        Boolean ans=a.isPalindrome(s);
        System.out.println(ans);
    }
}