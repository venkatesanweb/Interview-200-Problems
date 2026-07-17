class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int val : nums) sum+=val;
        if(sum%2!=0) return false;
        int k= sum/2;
        return help(nums,k);
    }
    private boolean help(int [] nums, int k){
        if(k==0) return true;
        boolean dp[] = new boolean[k+1];
        dp[0]=true;
        if(k>=nums[0]) {
            dp[nums[0]]=true;
        }
        for(int i=1;i<nums.length;i++){
            boolean curr[] = new boolean[k+1];
            curr[0]=true;
            for(int j=1;j<=k;j++){
                boolean not_taken = dp[j];
                boolean taken = false;
                if(j>=nums[i]){
                    taken = dp[j-nums[i]];
                }
                curr[j] = not_taken || taken;
            }
            dp=curr;
        }
        return dp[k];
    }
}
