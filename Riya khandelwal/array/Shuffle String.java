class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb= new StringBuilder("");
        char[] ch = new char[indices.length]; 
        for(int i=0; i<indices.length; i++)
        {
           ch[indices[i]] = s.charAt(i);
        }
        for(int j=0; j<ch.length; j++)
        {
            sb.append(ch[j]);
        }
            
        
        return sb.toString();
    }
}

time complexity -O(n)
space complexity -O(n) 
