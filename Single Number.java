class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        
        int single = 0;
        int flag = 0;
        
        for(int i = 0; i < len; i++) {
            single = nums[i];
            int x = 0;
            while(x < len) {
                if(x == i) //same index
                    x++; //go onto next
                else {
                    //check if not equal
                    if(single != nums[x])
                        flag = 1;
                    else { //equal 
                        
                        flag = 0; //reset flag and break
                        break;
                    }
                    x++;
                }
                
            }
            
            //if we come out the loop and flag is still 1
            if(flag == 1)
                break;
        }
        
        return single;
    }
}
