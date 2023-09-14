class Solution {
    public static void conquer(int arr[], int low, int mid, int high)
    {
        int merged[] = new int[high - low + 1];
        int idx1 = low;
        int idx2 = mid+1;
        int x = 0;
        while(idx1<= mid && idx2<=high)
        {
            if(arr[idx1] < arr[idx2])
            merged[x++] = arr[idx1++];
            else
            merged[x++] = arr[idx2++];
        }
        while(idx1<=mid)
        merged[x++] = arr[idx1++];
        while(idx2<=high)
        merged[x++] = arr[idx2++];

        for(int i=0, j=low;i<merged.length;i++,j++){
            arr[j] = merged[i];
        }
    }
    public static int pairCount(int arr[], int low, int mid, int high)
    {
        int count = 0;
        int right = mid+1;
        for(int i=low;i<=mid;i++)
        {
            while(right<=high  && (long)arr[i] > arr[right] * 2L){
            right++;
            }
            count+=right - (mid+1);
        }
        return count;
    }
    public static int divide(int arr[], int low, int high)
    {
        int count = 0;
        if(low<high)
        {
        int mid = (high + low)/2;
        count+=divide(arr, low, mid);
        count+=divide(arr, mid+1, high);
        count+=pairCount(arr,low, mid,high);
        conquer(arr, low, mid, high);
        }
        else 
        return count;

        return count;
    }
    public int reversePairs(int[] nums) {
        return divide(nums, 0, nums.length-1);
    }
}
