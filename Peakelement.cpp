// Online C++ compiler to run C++ program online
#include <bits/stdc++.h>
using namespace std;

int Peakelement(vector<int> vc){
    int left=0;
    int right=vc.size()-1;
    while(left<right){
        int mid = left+(right-left)/2;
        if(vc[mid]>vc[mid+1]){
            right=mid;
        }
        else{
            left=mid+1;
        }
    }
    return vc[left];
}

// arr[] = {1,2,1,3,5,6,4} 

int main() {
    int n;
    cin>> n;
    vector<int> vc(n);
    for(int i=0;i<n;i++){
        cin>>vc[i];
    }
    
    cout<<Peakelement(vc);
    return 0;
}
