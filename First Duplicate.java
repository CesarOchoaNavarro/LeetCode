int firstDuplicate(int[] a) {
    int len = a.length;
    
    for(int i = 0; i < len; i++) {
        int val = Math.abs(a[i]);
        if (a[val - 1] < 0)
            return val;
            
        a[val - 1] = -a[val - 1];
    }
    
    return -1;
}
