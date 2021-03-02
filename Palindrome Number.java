class Solution {
    public boolean isPalindrome(int x) {
        
        int reversed = 0;
        int flag = 0;
        int save = x;
        
        //check if negative
        if(x < 0)
            return false;
        
        while(x != 0) {
            flag = x % 10;
            x /= 10;
            
            if(reversed > Integer.MAX_VALUE/10 || reversed == Integer.MAX_VALUE/10 && flag > 7)
                return false;
            if(reversed < Integer.MIN_VALUE/10 || reversed == Integer.MIN_VALUE/10 && flag < -8)
                return false;
            
            reversed = (reversed * 10) + flag;
        }
        
        //System.out.print("REVERSED :" + reversed);
        
        boolean TF = (reversed == save) ? true : false;
        
        //System.out.print(save + "\n");
        //System.out.print(reversed);
        
        
        return TF;
    }
}
