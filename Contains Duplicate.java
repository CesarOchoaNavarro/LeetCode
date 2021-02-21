class Solution {
    public boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        
        for(int i  = 0; i < len; i++) {
            int t = nums[i];
            //go thorugh again //ahead by one
            for(int x = i+1; x < len; x++) {
                if(t == nums[x])
                    return true;
            }
        }
        return false;
    }
}
