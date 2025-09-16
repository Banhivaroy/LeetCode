class Solution {
    public long timeCalc(int[] piles,int k){
        long totalTime = 0;
        for(int i=0;i<piles.length;i++){
          long y=piles[i]/k;
if(piles[i]%k !=0){y++;}
          totalTime +=y;
        }
        return totalTime;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i=0;i<piles.length;i++){
            if(piles[i] > max){
                max = piles[i];
            }
        } 
        int lo = 1,hi = max;
        int mid = 0;
        int ans = max;
        while(lo<=hi){
            mid = (lo+hi)/2;
            long totalTime = timeCalc(piles,mid);
            if(totalTime<=h){
                ans = mid;
                hi = mid-1;
            } 
             else{
                lo = mid+1;
            }
        }
        return ans;
        
    }
}