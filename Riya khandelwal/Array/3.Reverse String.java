class Solution {
    public void reverseString(char[] s) {
       int l=s.length; 
       int  n = Math.floorDiv(l,2);
        for(int i = 0 ;i<n ; i++)
        {
            char t =  s[i];
            s[i] = s[l-1-i];
            s[l-1-i] = t;
        }
    }
    
}
Time complixity= O(n)
space  complixity= O(1)
  
