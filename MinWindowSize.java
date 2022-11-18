import java.util.HashMap;

class MinWindowSize{
    public String smallestWindow(String s, String p){
        String ans ="";
        HashMap<Character , Integer> m2 = new HashMap<>();
        for(int i=0; i<p.length(); i++){
            char c = p.charAt(i);
            m2.put(c, m2.getOrDefault(c, 0) +1);
        }
        int mct= 0;
        int dmct =p.length();
        HashMap<Character , Integer> m1 = new HashMap<>();
        int i=-1;
        int j=-1;
        for(int z=0; z<s.length(); z++){

        
            boolean f1 = false;
            boolean f2 = false;
            while(i<s.length()-1 && mct<dmct){
                i++;
                char c = s.charAt(i);
                m1.put(c , m1.getOrDefault(c, 0) +1);
    
                if(m1.getOrDefault(c,0)<=m2.getOrDefault(c,0)){
                    mct++;
                }
                f1 =true;
            }
            while(j<s.length()-1 && mct==dmct){
                String pns  = s.substring(j+1, i+1);
                if(ans.length()==0 || pns.length()<ans.length()){
                    ans = pns;
                }
                j++;
                char c= s.charAt(j);
                m1.put(c , m1.getOrDefault(c,0)-1);
    
                if(m1.getOrDefault(c,0) < m2.getOrDefault(c,0)){
                    mct--;
                }
                f2= true;
            }
            if(f1==false && f2==false){
                break;
            }    
        
        }
        if(ans.length()==0){
            return "-1";
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "timetopractice";
        String p = "toc";
        MinWindowSize a = new MinWindowSize();
        String ans = a.smallestWindow(s, p);
        System.out.println(ans);
    }
}