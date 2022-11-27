import java.util.*;

public class Spiralmatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0){
            return ans;
        } 
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0;
        int right = m-1;
        int bottom = n-1;
        int left = 0;     
        while(ans.size() < n*m ){
            for(int i=left; i<=right && ans.size()<n*m ; i++){
                ans.add(matrix[top][i]);
            }
            for(int i=top+1; i<=bottom && ans.size()<n*m; i++){
                ans.add(matrix[i][right]);
            }
            for(int i=right-1; i>=left && ans.size()<n*m; i--){
                ans.add(matrix[bottom][i]);
            }
            for(int i=bottom-1; i>top && ans.size()<n*m; i--){
                ans.add(matrix[i][left]);
            }
            top++;right--;bottom--;left++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        Spiralmatrix b = new Spiralmatrix();
        List<Integer> ans = b.spiralOrder(a);
        System.out.println(ans);
    }
}
