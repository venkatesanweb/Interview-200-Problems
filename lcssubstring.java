import java.util.*;
class Solution {
    public static String lcs( String str1, String str2) {
        int n = str1.length(), m = str2.length();
        int dp[][] = new int[n+1][m+1];
        int maxlen =0;
        int end =0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                    if(dp[i][j]>maxlen){
                        maxlen=dp[i][j];
                        end=i;
                    }
                }
                else dp[i][j]=0;
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i=end-maxlen;i<end;i++){
            ans.append(str1.charAt(i));
        }
        return ans.toString();
    }
    public static void main(String[] args){
        System.out.println(lcs("abcde","abfce"));
    }
}

