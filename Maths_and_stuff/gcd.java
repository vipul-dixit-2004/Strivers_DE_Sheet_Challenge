public class Solution {
    public static int calcGCD(int n, int m){
        int gcd = 1;
        int small = n>m?m:n;
        for(int i=small;i>=2;i--){
            if(n%i==0 && m%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static int gcdOptimized(int n,int m){
      while(n>0 && m>0){
            if(n>m) n=n%m;
            else m = m%n;
        }
        if(n==0) return m;
        return n;
    }
}
