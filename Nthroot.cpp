#include <bits/stdc++.h>
using namespace std;

int Nthroot(int n,int k){
    int left=1;
    int right=n;
    int ans=1;
    while(left<=right){
        int mid=left+(right-left)/2;
        int pows = pow(mid,k);
        if(pows==n) return mid;
        else if((pows)<=n){
            ans=mid;
            left=mid+1;
        }
        else{
            right=mid-1;
        }
    }
    return -1;
}

// (27, 3)	3	3³ = 27
// (16, 2)	4	4² = 16
// (81, 4)	3	3⁴ = 81



// (10, 2)	-1
// (20, 3)	-1
// (50, 2)	-1


int main() {
    int n,k;
    cin >>n>>k;
    cout<<Nthroot(n,k);
    
    return 0;
}
