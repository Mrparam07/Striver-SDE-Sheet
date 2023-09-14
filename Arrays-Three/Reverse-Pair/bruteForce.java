class Solution {
    public int reversePairs(int[] nums) {
        int n = nums.length;
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(i==j)
                continue;
                long a = nums[i];
                long b = nums[j];
                if(a > b*2)
                count++;
            }
        }
        return count;
    }
}
