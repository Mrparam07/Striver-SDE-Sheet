import java.util.Arrays;
public class Solution {
    public static int[] findMissingRepeatingNumbers(int []a) {
        // Write your code here
        Arrays.sort(a);
        int ans[] = new int[2];
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i] == a[i+1]){
            ans[0] = a[i];
            }
            
        }
        boolean found;
        for(int i=1;i<=a.length;i++)
        {
            found = false;
           for(int j=0;j<a.length;j++)
           {
               if(a[j] == i){
               found = true;
               break;
               }
           }
           if(!found){
           ans[1] = i;
           break;
           }
        }
        //ans[1] = a.length;
        return ans;
    }
}
