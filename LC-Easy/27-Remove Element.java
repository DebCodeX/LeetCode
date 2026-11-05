class Solution {
    public int removeElement(int[] nums, int val) {
        int i,len,k=0,count=0;
        len=nums.length;
        for(i=0;i<len;i++){
            if(val!=nums[i]){
                nums[k]=nums[i];
                k++;
                count++;
            }
        }
        return count;
    }
}