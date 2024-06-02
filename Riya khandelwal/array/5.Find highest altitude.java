class Solution {
    public int largestAltitude(int[] gain) {
        int l=gain.length;
        int sum =0;
        int max =0;
        for( int i=0;i<l;i++)
        {
           sum += gain[i];
           max = Math.max(sum,max) ;
           /*if(sum > max)
           {
              max = Math.max(sum,max) ;
           }*/
        }
        return max;
        
    }
}
t.c = O(n)
s.c = O(1)  
