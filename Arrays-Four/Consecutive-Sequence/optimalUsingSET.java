class Solution {

    public int longestConsecutive(int[] nums) {
        int count = 0;
        int max = 0;
        
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
            set.add(nums[i]);

        for(int i: set)
        {
            if(!set.contains(i-1)){
                count = 0;
                int k = i;
                    while(set.contains(k)){
                    count++;
                    k++;
            }
            max = Math.max(max, count);
            } 
        }
        return max;
    }
}
