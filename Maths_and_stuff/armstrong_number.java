import java.lang.Math; 
public class Solution 
{
	public static boolean isArmstrong(int num)
	{
		int temp = num;
	    int digit = 0;
		while(num>0){
			digit++;
			num/=10;
		}
		num = temp;
		int sum=0;
		while(num>0){
			int remain = num%10;
			sum+= Math.pow(remain, digit);
			num/=10;
		}
		return sum==temp?true:false;
	}
}

