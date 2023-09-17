class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       int n = nums.length; // size of the array
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        // checking all possible quadruplets:
        for (int i = 0; i < n-3; i++) {
            for (int j = i + 1; j < n-2; j++) {
                for (int k = j + 1; k < n-1; k++) {
                    for (int l = k + 1; l < n; l++) {
                        long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                        if(sum == target)
                        {
                          //both the list method can be used
                            //ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                            ans.add(temp);
                        }
                        while(l<n-1 && nums[l] == nums[l+1]) l++;
                    }
                    while(k<n-1 && nums[k] == nums[k+1]) k++;
                }
                while(j<n-2 && nums[j] == nums[j+1]) j++;
            }
            while(i<n-3 && nums[i] == nums[i+1]) i++;
        }
        
        return ans;
    }
}
