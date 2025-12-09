#include <bits/stdc++.h>
using namespace std;

int main() {
    string s;
    getline(cin,s);
    string res="";
    for(int i=0;i<s.length();i++){
        if(s[i]=='e' || s[i]=='e' || s[i]=='i'||s[i]=='o'||s[i]=='u' ||s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U'||s[i]==' '){
            continue;;
        }
        else{
            res+=s[i];
        }
    }
    cout<<res;

    return 0;
}
