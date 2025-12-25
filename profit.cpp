#include <bits/stdc++.h>
using namespace std;
int Profval(vector<int> vc,int n)
{
    int minval=vc[0];
    int maxsellval=0;
    for (int i=1;i<n;i++)
    {
        minval=min(minval,vc[i]);
        maxsellval=max(maxsellval,vc[i]-minval);
    }
    return maxsellval;
}
int main()
{
    int n;
    cin>>n;
    vector<int> vc(n);
    for (int i=0;i<n;i++)
    {
        cin>>vc[i];
    }
   int resPro=Profval(vc,n);
    cout<<resPro;

}
