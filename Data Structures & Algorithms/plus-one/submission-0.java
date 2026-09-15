class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        int rem = 0;
        int len = digits.length;
        for(int i = len-1; i>=0; i--){
            rem = (digits[i]+1)%10;
            carry = (digits[i]+1)/10;
            digits[i] = rem;
            if(carry ==1){
                if(i ==0){
                    int [] ans  = new int[len+1];
                    ans[0] = carry;
                    for(int j=1; j<=len;j++){
                        ans[j] = digits[j-1];
                    }
                    return ans;
                }
                continue;
            }
            if(carry==0){
                break;
            }
        }
        return digits;    
    }
}
