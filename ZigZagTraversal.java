public class ZigZagTraversal{
    public void traverse(int [][]a){
        int i=0;
        while(i<a[0].length){
            int j=0;
            int x=i;
            while(x>=0){
                System.out.print(a[x][j] + " ");
                j++;
                x--;
            }
            System.out.println();
            i++;
        }
        int k=0;
        while(k<a[0].length){
            int p=i;
            int q=k;
            while(q<a[0].length){    
                System.out.print(a[p][q] + " ");
                q++;
                p--;
            }
            k++;
            System.out.println();
        }    
    }
    public static void main(String[] args) {
        int arr[][] = {{ 1, 2, 3, 4 },{ 5, 6, 7, 8 },{ 9, 10, 11, 12 },{ 13, 14, 15, 16 },{ 17, 18, 19, 20 }};
        ZigZagTraversal a = new ZigZagTraversal();
        a.traverse(arr);
    }
}