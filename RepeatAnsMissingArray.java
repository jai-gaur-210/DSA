import java.util.Hashtable;

public class RepeatAnsMissingArray {
    public int[] repeatedNumber(final int[] A) {
        int a=0;
        int b=0;
        int n = A.length;
        int ans[] = new int[n+1];
        
        for(int i=0; i<n;i++){
            ans[A[i]]+=1;
        }
        for(int i=0; i<n+1; i++){
            if(ans[i]==2){
                a=i;
            }
            if(ans[i]==0){
                b=i;
            }
        }
        int result[]={a,b};
        return(result);
    }          
    public static void main (String[] args){
        int arr[] = { 2, 2};
        RepeatAnsMissingArray a = new RepeatAnsMissingArray();
        int ans[] = a.repeatedNumber(arr);
        System.out.println(ans[0]+" "+ans[1] );   
    }
}
