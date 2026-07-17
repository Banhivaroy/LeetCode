class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int high = numbers.length-1;
       int low = 0;
      

       while(low<high){
        int sum = numbers[low]+numbers[high];
        if(sum == target){
            return new int[]{low+1,high+1};
        } else if(sum <target){
            low++;
        } else if(sum >target){
            high--;
        }
       }
       return new int[]{-1,-1};
        
    }
}