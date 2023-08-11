class Solution {
    public int reverse(int x) {
       int output = 0;
        while(x!=0){
            if(output>Integer.MAX_VALUE/10 || output<Integer.MIN_VALUE/10){
                return 0;
            }
            int remainder = x%10;
            output = output*10 + remainder;
            x/=10;
        }
        return output;
    }
}
