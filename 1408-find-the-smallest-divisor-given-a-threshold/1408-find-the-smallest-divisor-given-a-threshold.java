class Solution {
    public int Sum(int[] nums,int mid){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += (nums[i] + mid - 1) / mid;
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        } 
        int hi = max,lo = 1;
        int ans = max;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            int sum = Sum(nums,mid);
            if(sum>threshold){
                lo = mid+1;
            }  else{
                ans = mid;
                hi = mid-1;
            }
        }
        return ans;
    }
}