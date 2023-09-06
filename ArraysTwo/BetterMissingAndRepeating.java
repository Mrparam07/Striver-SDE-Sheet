import java.util.Arrays;
public class Solution {
    public static int[] findMissingRepeatingNumbers(int []a) {
        // Write your code here
        int n = a.length;
        int hash[] = new int[n+1];

        for(int i=0;i<n;i++)
        {
            hash[a[i]]++;
        }
        int missing=-1, repeating=-1;
        for(int i=1;i<=n;i++)
        {
            if(hash[i] == 2)
            repeating=i;
            else if(hash[i] == 0)
            missing=i;

            if(missing!=-1 && repeating!=-1)
            break;
        }
        int ans[] = {repeating,missing};
        return ans;
    }
}
