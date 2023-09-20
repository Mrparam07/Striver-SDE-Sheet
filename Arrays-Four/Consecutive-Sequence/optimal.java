class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0)
        return 0;
        Arrays.sort(nums);
        int count=0, longest = 1, lastElement = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            if(nums[i] - 1 == lastElement)
            {
                count +=1;
                lastElement = nums[i];
            }
            else if(nums[i] != lastElement)
            {
                count = 1;
                lastElement = nums[i];
            }
            longest = Math.max(count, longest);
        }
        return longest;
    }
}
