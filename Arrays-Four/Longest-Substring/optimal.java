class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
        return 0;
         int max = 0;
         int count = 0;
        
        for(int i = 0;i<s.length();i++)
        {
            Set<Character> map = new HashSet<>(); 
            count = 0;
            for(int j = i;j<s.length();j++)
            {
                if(map.contains(s.charAt(j)))
                {
                    //max = Math.max(max, j-i);
                    break;
                }
                map.add(s.charAt(j));
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
