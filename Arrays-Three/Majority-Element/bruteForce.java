class Solution {
    public int majorityElement(int[] nums) {
        int count, max=0,k, ans=0;
        for(int i = 0;i<nums.length;i++)
        {
            count=0;
            k=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i] == nums[j])
                count++;
            }
            if(count>max){
            max = count;
            ans = nums[i];
            }
        }
        return ans;
    }
}
