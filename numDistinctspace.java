class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length()-1;
        int m = t.length()-1;
        int dp[][] = new int[n+2][m+2];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return helpSpace(s,t);
    }
    private int helpMemo(String s,String t,int n,int m,int dp[][]){
        if(m<0) return 1;
        if(n<0) return 0;
        if(dp[n][m]!=-1) return dp[n][m];
        if(s.charAt(n)==t.charAt(m)){
            return helpMemo(s,t,n-1,m-1,dp) + helpMemo(s,t,n-1,m,dp);
        }
        return dp[n][m]=helpMemo(s,t,n-1,m,dp);
    }
    
    private int helpSpace(String s,String t){
        int n = s.length();
        int m = t.length();
        int dp[] = new int[m+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            int curr[] = new int[m+1];
            curr[0]=1;
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    curr[j]=dp[j-1] + dp[j];
                }
                else{
                    curr[j]=dp[j];
                }
            }
            dp = curr;
        }
        return dp[m];
    }
}
