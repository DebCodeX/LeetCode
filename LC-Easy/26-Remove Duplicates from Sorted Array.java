class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1,i,k=1;
        for(i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                count++;
                nums[k]=nums[i];
                k++;
            }
        }
        return count;
    }
}