public class LongestRepeatingCharReplace {
    public int characterReplacement(String s, int k) {
        // BAAAB
        char[] c = s.toCharArray();
        int m=k;
        int l=0; int h=0; int n =c.length;
        int max= 0;
        int max1=0;
        while(h<n){
            if(c[l]!=c[h]){
                if(m!=0){
                    max1 = Math.max(max1, h-l+1);
                    m--;
                    h++;
                }
                else{
                    l++;
                    h=l;
                    m=k;
                    max=Math.max(max,max1);
                    max1=0;
                }
            }else{
                max1 = max1+1;
                h++;
            }
        }
        max=Math.max(max,max1);
        max1=0;
        m=k;
        l=n-1;h=n-1;
        while(h>=0){
            if(c[l]!=c[h]){
                if(m!=0){
                    max1 = Math.max(max1, l-h+1);
                    m--;
                    h--;
                }
                else{
                    l--;
                    h=l;
                    max=Math.max(max,max1);
                    max1=0;
                }
            }
            else{
                max1+=1;
                h--;
            }
        }
        max=Math.max(max,max1);
        if(max==n-1){
            if(c[0]==c[n-1]){
                max+=1;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "BAAAB";
        int k=2;
        LongestRepeatingCharReplace a =new LongestRepeatingCharReplace();
        int ans=a.characterReplacement(s , k);
        System.out.println(ans);
    }
}
