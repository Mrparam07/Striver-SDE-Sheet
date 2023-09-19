class Solution {
    public static boolean linearSearch(int[] nums, int el)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == el)
            return true;
        }
        return false;
    }
    public int longestConsecutive(int[] nums) {
        
        int count = 0, max = 0;
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            count = 0;
            while(linearSearch(nums, x+1)){
                count++; x++;
            }
            if(count>max)
            max = count;
        }
        if(nums.length == 0)
        return 0;
        return max+1;
    }
}
