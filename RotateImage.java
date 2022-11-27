import java.util.*;

public class RotateImage {
    public void rotate(int[][] matrix) {   
        int N = matrix.length;
        int M = matrix[0].length;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for (int i = 0; i < N; i++){
            for (int j = i + 1; j < M; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }     
        for(int i=0; i<N; i++){
            for(int j=0; j<(M/2); j++){ 
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][M-j-1];
                matrix[i][M-j-1] = temp;
            }
        }
        for(int i=0; i<N; i++){
            List<Integer> a = new ArrayList<Integer>();
            for(int j=0; j<M; j++){
                a.add(matrix[i][j]);
            }
            ans.add(a);    
        }
        System.out.println(ans);
    }    
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        RotateImage a = new RotateImage();
        a.rotate(arr);
    }
}
