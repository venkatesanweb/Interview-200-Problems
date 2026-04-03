#include<bits/stdc++.h>
using namespace std;
//  {3,5,8,15,19}, x = 9
int lowerbound(vector<int> &vc,int key){
    sort(vc.begin(), vc.end());
    int left=0;
    int right=vc.size()-1;
    int ans =-1;
    while(left<=right){
        int mid = left+(right-left)/2;
        
        if(vc[mid]>=key){
             ans=mid;// 3<=10
            right=mid-1;
        }
        else{
            left=mid+1;
            // ans=mid;
        }
    }
    return ans;
}

int main() {
    int n;
    cin >> n;
    vector<int> vc(n);
    for(int i=0;i<n;i++){
        cin >>vc[i];
    }
    cout<<lowerbound(vc,9);

    return 0;
}
