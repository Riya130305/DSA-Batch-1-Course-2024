class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int start =0;
        int end = (row*col)-1;
        
        
        while(start<=end)
        {
            int mid = (start+end)/2;
            int rows = mid/col;
            int cols = mid%col;
            int mid1 = matrix[rows][cols];
            if(mid1==target)

            {
                return true;
            }
            else if(mid1>target)
            {
                end=mid-1;
            }
            else
            {
                start = mid+1;
            }
            // for(int j=0 ; j< col ;j++)
            // {

            // }
        }
        return false;
    }
}
//Time Complexity: O(log(row×col))

//Space Complexity:O(1) 

