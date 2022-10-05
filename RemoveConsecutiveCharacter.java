public class RemoveConsecutiveCharacter {
    public String removeConsecutiveCharacter(String s){
        char c[] =s.toCharArray();
        char ans[] = new char[c.length];
        char c1 ='1';
        int k=0;
        for(int i=0; i<c.length; i++){
            if(c[i]!=c1){
                ans[k] = c[i];
                k++;
            }
            c1 = c[i];
        }
        String string = "";      
        for(int i=0; i<k; i++){
            string+=ans[i];
        }
        return string;
    }
    public static void main(String[] args) {
        String s = "aabaa";
        RemoveConsecutiveCharacter a =new RemoveConsecutiveCharacter();
        String ans=a.removeConsecutiveCharacter(s);
        System.out.println(ans);
    }
}
