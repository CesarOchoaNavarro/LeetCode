class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        
        int x = len-1;
        
        char[] temp = new char[len];
        
        for(int i = 0; i < len; i++) {
            temp[i] = s[i];
        }
        
        for(int i = 0; i < len; i++) {
            s[i] = temp[x];
            x--;
        }
    }
}
