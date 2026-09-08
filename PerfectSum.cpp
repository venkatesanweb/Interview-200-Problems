#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    bool ans[100001];
    for(int i=1;i*i<=n;i++){
        int sq = i*i;
        for(int j=1;j*j*j<=n;j++){
            int qub = j*j*j;
            int sum = sq+qub;
            if(sum<=n){
                ans[sum]=true;
            }
        }

    }
    int co=0;
    for(int i=0;i<=n;i++){
        if(ans[i]) co++;
    }
    cout<<co;
}
