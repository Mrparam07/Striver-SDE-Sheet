class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int arr[][] = new int[n][m];
        int k = n-1;
        int l=0;

        for(int i=0;i<n;i++)
        {
            k=n-1;
            for(int j=0;j<m;j++)
            {
                arr[i][j] = matrix[k][l];
                k--;
            }
            l++;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j] = arr[i][j];
            }
        }
    }
}
