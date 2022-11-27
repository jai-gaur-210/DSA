public class WordSearch {
    Boolean isSafe(char [][] board , int i , int j, String s ,int k  , int[][]arr){     
        int n = board.length;
        int m = board[0].length;   
        if(k==s.length()){
            return true;
        }
        if(i<n && j<m && i>-1 && j>-1 && board[i][j] == s.charAt(k) && arr[i][j]!=1){
            arr[i][j] = 1;
            k++;
            if(isSafe(board , i , j+1 , s, k ,arr )){
                return true;
            }
            if(isSafe(board , i+1 , j , s , k ,arr )){
                return true;
            }
            if(isSafe(board , i , j-1 ,s , k, arr )){
                return true;
            }
            if(isSafe(board , i-1 , j , s, k ,arr )){
                return true;
            }
            arr[i][j]=0;
        }
        
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length; 
        int arr[][] = new int [n][m]; 
        int k=0;      
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j] == word.charAt(0)){
                    if(isSafe(board, i, j, word, k , arr)){
                        return true;
                    }
                }
            }
        }
        return false; 
    }
    public static void main(String[] args) {
        char arr[][] = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        WordSearch a = new WordSearch();
        Boolean ans = a.exist(arr, "ABCCED");
        System.out.println(ans);
    }
}
