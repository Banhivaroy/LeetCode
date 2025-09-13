class Solution {
    public int findKthPositive(int[] arr, int k) {
        int ans = k;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=ans){
                ans++;
            } else {
                break;
            }
        }
        return ans;
    }
}