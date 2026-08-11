class Solution {
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;
        while(i>=0){
            if(digits[i]<9){
                digits[i] += 1;
                return digits;
            }
            else{
                digits[i]=0;
                i--;
            }
        }
        int[] arr=new int[digits.length+1];
        arr[0]=1;
        return arr;
    }
}