class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0;
        if(nums1.length>=nums2.length)
        {
            for(int i=m;i<nums1.length;i++)
            {
                nums1[i] = nums2[k];
                k++;
            }
            Arrays.sort(nums1);
            //return nums1;
        }
        else if(nums2.length>nums1.length)
        {
            for(int i=n;i<nums2.length;i++)
            {
                nums2[i] = nums1[k];
                k++;
            }
            Arrays.sort(nums2);
            //return nums2;
        }


    }
}
