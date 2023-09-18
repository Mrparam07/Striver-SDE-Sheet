class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> st = new HashSet<>();
       int n = nums.length; // size of the array
       //Arrays.sort(nums);
        
        
        Arrays.sort(nums);
        // checking all possible quadruplets:
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Set<Long> hashset = new HashSet<>();
                for (int k = j + 1; k < n; k++) 
                {
                    long sum = (long) nums[i] + nums[j] + nums[k];
                    long more = target - sum;
                    if(hashset.contains(more))
                    {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], (int)more);
                        
                        // temp.sort(Integer::compareTo);
                        st.add(temp);

                    }
                    hashset.add((long)nums[k]);
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
}
