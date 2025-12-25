int longestConsecutive(vector<int>& nums) {
    if(nums.size()==0) return 0;
    sort(nums.begin(),nums.end());
    int co=1;
    int maxs=1;
    for(int i=1;i<nums.size();i++){
        if(nums[i-1]==nums[i]){
            continue;
        }
        else if(nums[i-1]+1==nums[i]){
            co++;
        }
        else{
            co=1;
        }
        maxs=max(maxs,co);
    }
    return maxs;
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
