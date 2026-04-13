class Solution {
public:
    int sumOfEncryptedInt(vector<int>& nums) {
        int sum=0;
        for(int val : nums){
            if(val<=9) {
                sum+=val;
                continue;
            }
            else{
                int co=0;
                int maxi=INT_MIN;
                while(val>0){
                    maxi=max(maxi,val%10);
                    val/=10;
                    co++;
                }
                int ans=0;
                while(co--){
                    ans=ans*10+maxi;
                }
                sum+=ans;
            }
        }
        return sum;
    }
};
