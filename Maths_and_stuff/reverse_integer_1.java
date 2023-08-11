class Solution {
    public int reverse(int x) {
      //1st method can be by using long data type for storing on the number.
       long output = 0;
      //basic stuff
        while(x!=0){
            int remainder = x%10;
            output = output*10 + remainder;
            x/=10;
        }
      // checking if the output is more than a integer
        if(output>Integer.MAX_VALUE || output<Integer.MIN_VALUE){
            // returns 0 if output is not an integer.
            return 0;
        }
      //returning a int type output
        return (int)output;
    }
}
