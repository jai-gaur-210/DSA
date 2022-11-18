public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] str) {
        String x = str[0];
        for(int i=1; i<str.length; i++){
            String a ="";
            int n = Math.min(x.length() , str[i].length() );
            for(int j=0; j<n; j++){
                if(x.charAt(j)==str[i].charAt(j)){
                    a+=x.charAt(j);
                }else{
                    break;
                }
            }
            x=a;
        }
        return x;
    }
    public static void main(String[] args) {
        String[] s = { "flower", "flow", "flight" };
        LongestCommonPrefix a = new LongestCommonPrefix();
        String ans = a.longestCommonPrefix(s);
        System.out.println(ans);
    }
}
