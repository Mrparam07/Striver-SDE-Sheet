class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i=m-1, j=n-1, id = m+n-1;
       while(i>=0 && j>=0)
       {
           if(nums1[i] >= nums2[j]){
               nums1[id--] = nums1[i--];
           }
           else if(nums1[i] < nums2[j]){
               nums1[id--] = nums2[j--];
           }
       }
       while(i>=0)
       nums1[id--] = nums1[i--];
       while(j>=0)
       nums1[id--] = nums2[j--];
    }
}
