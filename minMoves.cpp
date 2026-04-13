class Solution {
public:
    int minMoves(vector<int>& nums) {
        int co=0;
        int maxele=*max_element(nums.begin(),nums.end());
        for(int val : nums){
            int min = maxele - val;
            if(min>0) co+=min;
        }
        return co;
    }
};
