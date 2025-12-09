#include <bits/stdc++.h>
using namespace std;

int main() {
    string s;
    getline(cin,s);
    set<char> st;
    for(char c:s){
        if(!st.count(c)){
            st.insert(c);
        }
        else{
            cout<<c<<endl;
        }
    }

    return 0;
}
