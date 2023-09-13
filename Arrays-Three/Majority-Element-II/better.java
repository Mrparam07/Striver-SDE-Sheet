class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            map.put(nums[i], map.get(nums[i])+1);
            else
            map.put(nums[i], 1);
        }
        //int result = 0;
        int n = nums.length;

        for(int i=0;i<nums.length;i++)
        {
            if(ans.size() == 0 || ans.get(0) != nums[i])
            {
            if(map.get(nums[i]) > n/3){
                ans.add(nums[i]);
            }
            }
            if(ans.size() == 2)
            break;
        }
        return ans;
    }
}
