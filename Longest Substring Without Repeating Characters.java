class Solution {
    // This function returns true if all characters in
    // str[i..j] are distinct, otherwise returns false
    public static Boolean areDistinct(String str, int i, int j) {
     
        // Note : Default values in visited are false
        boolean[] visited = new boolean[26];
 
        for(int k = i; k <= j; k++)
        {
            if (visited[str.charAt(k) - 'a'] == true)
                return false;
             
            visited[str.charAt(k) - 'a'] = true;
        }
        
        return true;
    }
    
    
    public int lengthOfLongestSubstring(String s) {
        
        int len = s.length();
        int longest = 0;

        
        for(int i = 0; i < len; i++) {
            for(int j = i; j < len; j++)
                if (areDistinct(s, i, j))
                    longest = Math.max(longest, j - i + 1);     
        }
        
        return longest;
    }
}
