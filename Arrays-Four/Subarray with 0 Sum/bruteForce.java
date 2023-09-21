import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		int max = 0;

		for(int i=0;i<arr.size();i++)
		{
			int sum=0;
			for(int j=i;j<arr.size();j++)
			{
				sum+=arr.get(j);

				if(sum == 0 && j-i+1>max)
				max = j-i+1;
			}
		}
		return max;
	}
}
