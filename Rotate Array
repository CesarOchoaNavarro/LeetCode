class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        
        //first loop to go though the list k many times
        for(int i = 0; i < k; i++) {
            //start shifting everything holding onto the last and moving everything forward
            int hold = nums[len-1]; //grab onto last
            for(int x = len-2; x >= 0; x--) {
                    nums[x+1] = nums[x];
            }
            //store in first spot
            nums[0] = hold;
        }

    }
}
