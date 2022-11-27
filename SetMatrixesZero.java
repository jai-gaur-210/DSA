
public class SetMatrixesZero {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        Boolean f1=false;
        Boolean f2=false;
        for(int i=0; i<m; i++){
            if(matrix[0][i]==0){
                f1=true;
                break;
            }
        }
        for(int i=0; i<n; i++){
            if(matrix[i][0]==0){
                f2=true;
                break;
            }
        }

        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;  
                }
            }
        }
        for(int i=0; i<m; i++){
            if(matrix[0][i]==0){
                for(int j=0; j<n; j++){
                    matrix[j][i]=0;
                }
            }
        }
        for(int i=0; i<n; i++){
            if(matrix[i][0]==0){
                for(int j=0; j<m; j++){
                    matrix[i][j]=0;
                }
            }
        }
        if(f1==true){
            for(int i=0; i<m; i++){
                matrix[0][i]=0;
            }
        }
        if(f2==true){
            for(int i=0; i<n; i++){
                matrix[i][0]=0;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int a[][] = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        SetMatrixesZero b = new SetMatrixesZero();
        b.setZeroes(a); 
    }
}
