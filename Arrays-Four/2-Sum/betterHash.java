class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
           int more = target - nums[i];
           if(map.containsKey(more)){
               a[0] = map.get(more);
               a[1] = i;
               return a;
           }
           map.put(nums[i], i);
        }
        return a;
    }
}
