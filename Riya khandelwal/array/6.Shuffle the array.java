class Solution {
    public int[] shuffle(int[] nums, int n) {
       int[] a = new int[nums.length];
        
        
        for (int i = 0, j = 0; i < n; i++, j += 2) {
            a[j] = nums[i]; 
            a[j + 1] = nums[i + n]; 
        }
        return a;
    }
}

//T.c= O(n)

// s.c = O(n)
