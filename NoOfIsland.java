public class NoOfIsland {
    public void isCount(char[][] grid, int i, int j, int[][] arr) {
        int n = grid.length;
        int m = grid[0].length;
        if (i < n && j < m && i >= 0 && j >= 0 && grid[i][j] == '1' && arr[i][j] != 1) {
            arr[i][j] = 1;
            isCount(grid, i, j + 1, arr);
            isCount(grid, i + 1, j + 1, arr);
            isCount(grid, i + 1, j, arr);
            isCount(grid, i + 1, j - 1, arr);
            isCount(grid, i, j - 1, arr);
            isCount(grid, i - 1, j, arr);
            isCount(grid, i-1, j - 1, arr);
            isCount(grid, i - 1, j + 1, arr);
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && arr[i][j] == 0) {
                    count++;
                    isCount(grid, i, j, arr);
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        char[][] ar = { { '0', '1' }, { '1', '0' }, { '1', '1'}, { '1', '0' } };
        NoOfIsland a = new NoOfIsland();
        int ans = a.numIslands(ar);
        System.out.println(ans);
    }
}
