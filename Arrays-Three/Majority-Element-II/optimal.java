class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        int cnt1=0, cnt2=0, el1=0, el2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(cnt1 == 0 && nums[i] != el2){
                cnt1=1;
                el1=nums[i];
            }
            else if(cnt2 == 0 && nums[i] != el1){
                cnt2=1;
                el2=nums[i];
            }
            else if(nums[i] == el1)
            cnt1++;
            else if(nums[i] == el2)
            cnt2++;

            else{
                cnt1--; cnt2--;
            }
        }
        int k=0,l=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == el1)
            k++;
            else if (nums[i] == el2)
            l++;
        }
        if(k > nums.length/3)
            ans.add(el1);

        if(l > nums.length/3)
            ans.add(el2);

        return ans;
    }
}
