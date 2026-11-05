class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length-1,i;
        for(i=len;i>=0;i--){
            if(digits[i]!=9){
                digits[i]=digits[i]+1;
                return digits;
            }
            digits[i]=0;
            }
            int arr[]=new int[digits.length+1];
            if(len==1){
                arr[0]=1;
            }
            else{
                arr[0]=digits[0]+1;
            }
            return arr;
        }
    }