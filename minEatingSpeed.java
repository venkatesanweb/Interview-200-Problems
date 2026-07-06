class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low =1;
        int high = Integer.MIN_VALUE;
        for(int val : piles) high=Math.max(high,val);
        // System.out.println(high);
        int ans = 0;
        while(low<=high){
            long sum=0;
            int mid = low + (high-low)/2;
            for(int val : piles){
                sum=sum + (val+mid-1)/mid;
            }
            if(sum<=h){
                ans = mid;
                high=mid-1;
            } 
            else low = mid+1;
        }
        return ans;
    }
}
