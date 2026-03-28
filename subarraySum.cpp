#include <bits/stdc++.h>
using namespace std;

int subarraySum(vector<int> & vc){
    int maxi=0;
    int len=vc.size();
    for(int i=0;i<len;i++){
        int co=1;
        int sum=0;
        for(int j=i;j<len;j++){ // -3 3 -1 6 5 
            sum+=vc[j];
            if(sum==0){
                int co=j-i+1;
                maxi=max(co,maxi);
            }
        }
    }
    return maxi;
}
int optminalway(vector<int> vc){
    map<int,int> mp;
    int sum=0;
    int maxi=0;
    for(int i=0;i<vc.size();i++){
        sum+=vc[i];
        if(sum==0){
            maxi=i+1;
        }
        if(mp.find(sum)!=mp.end()){
            int len=(i-mp[sum]);
            maxi=max(len,maxi);
        }
        else{
            mp[sum]=i;
        }
    }
    return maxi;
}

int main() {
    int n;
    cin>>n;
    vector<int> vc(n);
    for(int i=0;i<n;i++){
        cin >> vc[i];
    }
    cout<<optminalway(vc);
    return 0;
}
