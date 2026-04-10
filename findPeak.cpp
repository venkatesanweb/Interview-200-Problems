#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
  
    int findPeak(vector<int> &nums)  {
        int left =0;
        int right =nums.size()-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(nums[mid]>nums[mid+1]){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
};
// {1,2,3,4,5,6,7,8,5,1}

int main(){
    int n;
    cin>> n;
    vector<int> vc(n);
    for(int i=0;i<n;i++){
        cin>>vc[i];
    }
    Solution sc;
    cout<<sc.findPeak(vc);
}


