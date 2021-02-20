class Solution {
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
        
        return false;
    
    }
}
