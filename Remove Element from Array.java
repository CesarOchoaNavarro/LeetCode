class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int x = 0;
        
        for(int i = 0; i < len; i++)
        {
            if(nums[i] != val) { //if match
                nums[x] = nums[i];
                x++;
            }
        }
        
        if(x<len) {
            nums[x] = '\0';
        }
        
        return x;
    }
}
