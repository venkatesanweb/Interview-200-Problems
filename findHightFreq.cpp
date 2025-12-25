
#include <bits/stdc++.h>
using namespace std;
int main() {
    string s;
    cin>>s;
    map<char,int>frq;
    for(char ch:s){
        frq[ch]++;
    }
    int max=0;
    char c;
    for(auto s:frq){
        if(s.second>max){
            max=s.second;
            c=s.first;
        }
    }
    // cout<<max;
    cout<<c;

    return 0;
}
