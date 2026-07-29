class Solution {
    public int LIS(int[] nums) {
        int dp[][] = new int[nums.length][nums.length+1];
        for(int [] arr : dp){
            Arrays.fill(arr,-1);
        }
        return help(nums,0,-1,dp);
    }
    private static int help(int arr[],int idx,int idx_prv,int dp[][]){
        if(arr.length==idx) return 0;
        if(dp[idx][idx_prv+1]!=-1) return dp[idx][idx_prv+1];
        int len =0 + help(arr,idx+1,idx_prv,dp);
        if(idx_prv==-1 || arr[idx]>arr[idx_prv]){
            len =Math.max(1 + help(arr,idx+1,idx,dp),len);
        }
        return dp[idx] [idx_prv+1] = len;
    } 
}

