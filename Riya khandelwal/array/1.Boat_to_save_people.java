 class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        int i=0;
        int j= people.length-1;
        int c=0;
        Arrays.sort(people);
        while(i<=j)
        {
            
            if(people[i] + people[j] > limit)
            {
                j--;
                c++;
            }
            else if(people[i] + people[j]<=limit)
            {
                i++;
                j--;
                c+=1;
            }
           
        }
        return c;
        
    }
}

//Time Complexity: O(nlogn)

//Space Complexity: O(logn)

