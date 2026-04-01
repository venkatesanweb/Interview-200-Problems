// Online C++ compiler to run C++ program online
#include <bits/stdc++.h>
using namespace std;

string Processing(string s){
    string ans;
    int count=0;
    for(char ch : s){
        if(ch=='('){
            count++;
            if(count>1){
                ans+=ch;
            }
        }
        else{
            count--;
            if(count>0){
                ans+=ch;
            }
        }
    }
    return ans;
}

int main() {
    string s;
    cin>>s;
    cout<<Processing(s);

    return 0;
}
