class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        
        int n = accounts.size();
        int m = accounts[0].size();
        int sum = 0;
        int maxi = INT_MIN;
        for(int i = 0; i<n; i++){
            sum = 0;
            for(int j =0; j<m; j++){
                sum+=accounts[i][j];
            }
           maxi  = max(maxi, sum);
        }
        
       
        return maxi;
    }
};
//Time Complexity = O(n*m) Space Complexity = O(1)