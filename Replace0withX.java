public class Replace0withX {
    public char[][] fill(int n, int m, char a[][])
    {   char[][] arr= {{'X', 'X', 'X', 'X'}, 
    {'X', 'O', 'X', 'X'}, 
    {'X', 'O', 'O', 'X'}, 
    {'X', 'O', 'X', 'X'}, 
    {'X', 'X', 'O', 'O'}};
        return arr;
    }
    public static void main(String[] args) {
        int n =5;
        int m=4;
        char[][] arr= {{'X', 'X', 'X', 'X'}, 
                       {'X', 'O', 'X', 'X'}, 
                       {'X', 'O', 'O', 'X'}, 
                       {'X', 'O', 'X', 'X'}, 
                       {'X', 'X', 'O', 'O'}};
        Replace0withX a = new Replace0withX();
        char[][] ans = a.fill(n, m, arr);
        System.out.println(ans);

    }
}
