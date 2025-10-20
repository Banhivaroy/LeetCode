class Solution {
    public boolean check(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                ans++;
            }
        }
        if(ans>1){
            return false;
        } else{
            return true;
        }
    }
}