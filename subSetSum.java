        package DP;

        public class SubSequence {
            private static boolean subSetSum(int [] arr, int n,int k,int[][] dp){
                if(k==0) return true;
                if(n==0) return arr[0]==k;
                if(dp[n][k]!=-1) return dp[n][k]==1;
                boolean not_des = subSetSum(arr,n-1,k,dp);
                boolean take = false;
                if(k>=arr[n]){
                    take = subSetSum(arr,n-1,k-arr[n],dp);
                }
                dp[n][k]=(not_des || take )? 1 : 0;
                return not_des || take;
            }
            private static boolean tabulation(int [] arr, int n,int k){
                boolean dp[][] = new boolean[n][k + 1];
                for(int i=0;i<n;i++) dp[i][0]=true;
                dp[0][arr[0]]=true;
                for(int i=1;i<n;i++){
                    for(int j=1;j<=k;j++){
                        boolean not_des = dp[i-1][j];
                        boolean take = false;
                        if(j>=arr[i]){
                            take = dp[i-1][j-arr[i]];
                        }
                        dp[i][j]=not_des || take;
                    }
                }
                return dp[n-1][k];
            }
            private static boolean subSetsumSapce(int [] arr, int n,int k){
                boolean pre[] = new boolean[k + 1];
                pre[0]=true;
                if (arr[0] <= k)
                    pre[arr[0]] = true;
                for(int i=1;i<n;i++){
                    boolean[] curr = new boolean[k+1];
                    curr[0]=true;
                    for(int j=1;j<=k;j++){
                        boolean not_des = pre[j];
                        boolean take = false;
                        if(j>=arr[i]){
                            take = pre[j-arr[i]];
                        }
                        curr[j]=not_des || take;
                    }
                    pre=curr;
                }
                return pre[k];
            }
        }
