class Solution {
    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int temp=0;
        int n = prices.length;
        if(n==1)
        return 0;
        for(int i=0;i<n;i++)
        {
            temp=0;
            for(int j=i+1;j<n;j++)
            {
                temp = prices[j] - prices[i];

                if(temp>max)
                max = temp;
            }
            
        }
        if(max == -1)
        return 0;
        else
        return max;
    }
}
