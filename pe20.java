import java.math.*;

public class pe20 {
	public static BigInteger Factorial(int n){
		BigInteger fac=BigInteger.valueOf(1);
		for(int i=2;i<=n;i++){
		  fac = fac.multiply(BigInteger.valueOf(i));
		}
		return fac;
		}
	
	public static void main(String[] args){
		BigInteger num=Factorial(100);
		System.out.println(num);
		String s=num.toString();
		int sum=0;
		for(int i=0;i<s.length();i++){
			sum+=Character.digit(s.charAt(i),10);
		}
		System.out.println(sum);
	}
	
	
}
