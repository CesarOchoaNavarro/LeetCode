class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        
        int [] sum = new int[2];
        
        for(int i = 0; i < len; i++) {
            int check = 0;
            
            while(check < len) {
                if(check == i) //if at same index dont count it
                {
                    check++;
                }
                else {
                    //else check
                    if(nums[i]+nums[check] == target) {
                        //store index and return
                        sum[0] = i;
                        sum[1] = check;
                        break;
                    }
                }
                
                check++;
            }
        }
        
        return sum;
        
    }
}
