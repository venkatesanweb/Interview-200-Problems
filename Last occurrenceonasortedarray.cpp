#include<bits/stdc++.h>
using namespace std;
int lastOcc(vector<int> &vc,int target){
    int left=0;
    int right=vc.size()-1;
    int ans=-1;
    while(left<=right){
        int mid =(left+right)/2;
        if(vc[mid]==target){
            ans=mid;
            left=mid+1;
        }
        else if(vc[mid]>target){
            right=mid-1;
        }
        else{
            left=mid+1;
        }
    }
    return ans;
}

// N = 7, target = 60, array[] = {3, 4, 13, 13, 13, 20, 40}  
int main(){
    int a;
    cin>>a;
    vector<int> vc(a);
    for(int i=0;i<a;i++){
        cin>>vc[i];
    }
    int target;
    cin>>target;
    cout<<lastOcc(vc,target);
    
}
