class Solution {
    public static int nCr(int r, int c)
    {
        int res = 1;
        for(int i=0;i<c;i++)
        {
            res *= (r-i);
            res /= (i+1);
        }
        return res;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int row=1;row<=numRows;row++)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int col=1;col<=row;col++)
            {
                temp.add(nCr(row-1,col-1));
            }
            ans.add(temp);
        }
        return ans;
    }
}
