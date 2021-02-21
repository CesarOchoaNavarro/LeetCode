public class Solution {
    /*
    public boolean checkIfExist(int[] arr) {
        int len = arr.length;
        //int f = 0;
        for(int i = 0; i < len; i++) {

            //if negative do the original way

            //divide the first element by two and check if that is in the list
            if(arr[i] % 2 == 0) {
                int t = arr[i] / 2;

                for(int j = 0; j < len; j++) {
                    if(t == arr[j])
                    {
                        return true;
                    }
                }
            }

        }

        //if(f == 1)
        //return true;

        return false;

    }
     */
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
