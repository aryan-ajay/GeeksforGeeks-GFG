// Replace O's with X's

// Given a matrix mat of size N x M where every element is either 'O' or 'X'. Replace all 'O' with 'X' that are surrounded by 'X'.

// A 'O' (or a set of 'O') is considered to be surrounded by 'X' if there are 'X' at locations just below, just above, just left and just right of it.

// Example 1:

// Input: 
// n = 5, m = 4
// mat = {{'X', 'X', 'X', 'X'}, 
//        {'X', 'O', 'X', 'X'}, 
//        {'X', 'O', 'O', 'X'}, 
//        {'X', 'O', 'X', 'X'}, 
//        {'X', 'X', 'O', 'O'}}
// Output: 
// ans = {{'X', 'X', 'X', 'X'}, 
//        {'X', 'X', 'X', 'X'}, 
//        {'X', 'X', 'X', 'X'}, 
//        {'X', 'X', 'X', 'X'}, 
//        {'X', 'X', 'O', 'O'}}
// Explanation: 
// Following the rule the above matrix is the resultant matrix. 


class Solution{
    static int[] row = {-1, 0, 1, 0};
    static int[] col = {0, 1, 0, -1};
    static char[][] fill(int n, int m, char a[][])
    {
        // code here
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if((i==0 || i==n-1 || j == 0 || j== m-1) && a[i][j] == 'O' && arr[i][j] == 0) {
                    makeOne(i, j, n, m, a, arr);
                }
            }
        }
        for(int i = 0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(arr[i][j] == 0) a[i][j] = 'X';
            }
        }
        return a;
    }
    static void makeOne(int i, int j, int n, int m, char [][] a, int [][] arr){
        arr[i][j] = 1;
        for(int k=0; k<4; k++){
            int r = i+row[k];
            int c = j+col[k];
            
            if(r>=0 && r<n && c>=0 && c<m && a[r][c]=='O' && arr[r][c]==0){
                makeOne(r,c,n,m,a,arr);
            }
        }
    }
}
