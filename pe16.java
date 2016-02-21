import java.math.*;

public class pe16{
	public static void main(String[] args){
		BigInteger num = BigInteger.valueOf(2);
		num = num.pow(1000);
		String number = num.toString();
		int sum= 0;
		for(int i =0;i< number.length();i++){
			sum+=Character.digit(number.charAt(i),10);
		}
		System.out.println(sum);
	}
}