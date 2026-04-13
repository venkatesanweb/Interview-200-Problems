#include <iostream>
using namespace std;

int sqrtRoot(int n){
    int left=1;
    int right=n;
    int ans=1;
    while(left<=right){
        int mid=left+(right-left)/2;
        if((mid*mid)<=n){
            ans=mid;
            left=mid+1;
        }
        else{
            right=mid-1;
        }
    }
    return ans;
}

int main() {
    int n;
    cin >>n;
    cout<<sqrtRoot(n);
    

    return 0;
}
