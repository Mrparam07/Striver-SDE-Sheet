import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
    int count = 0;
    int temp=0;
    for(int i=0;i<nums.length;i++)
    {
        if(count == 0){
        temp = nums[i];
        count = 1;
        }

        else if(nums[i] == temp)
        count++;
        else
        count--;
    }    
    //For majority element
    
    // int cnt=0;
    // for(int i=0;i<nums.length;i++)
    // {
    //     if(nums[i] == temp)
    //     cnt++;
    //     if(cnt > nums.length/2)
    //     return temp;
    // }
    // return -1;
    return temp;
    }
}
