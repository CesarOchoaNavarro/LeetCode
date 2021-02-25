class Solution {
    public int reverse(int x) {
        
        int reversed = 0;
        int flag = 0;
        
        while(x != 0) {
            flag = x % 10; //123 / 1 = 12.  3 stores 3
            x /= 10;
            
            //take account of the boundaries
            if(reversed > Integer.MAX_VALUE/10 || reversed == Integer.MAX_VALUE/10 && flag > 7)
                return 0;
            if(reversed < Integer.MIN_VALUE/10 || reversed == Integer.MIN_VALUE/10 && flag < -8)
                return 0;
            
            
            reversed = (reversed * 10) + flag;
        }
        
        return reversed;
    }
}
