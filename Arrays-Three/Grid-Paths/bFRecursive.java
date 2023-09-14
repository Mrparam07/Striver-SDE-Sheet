class Solution {
    public int uniquePaths(int m, int n) {
        return helper(m ,n, 0 , 0);
    }
    public static int helper(int m, int n, int i ,int j)
    {
         if(i==(m-1) && j == (n-1))
        return 1;
        if(i>=m || j>=n)
        return 0;
        else
        return helper(m, n, i+1, j) + helper(m, n, i, j+1);
    }
}
