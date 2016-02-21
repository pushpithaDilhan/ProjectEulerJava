import java.math.*;

public class pe15{
public static void main(String[] args){

BigInteger a = Factorial(40);
BigInteger b = Factorial(20);
BigInteger c = a.divide(b.multiply(b));
System.out.println(c);

}

public static BigInteger Factorial(int n){

BigInteger fac=BigInteger.valueOf(1);
for(int i=2;i<=n;i++){
  fac = fac.multiply(BigInteger.valueOf(i));
}
return fac;
}

}
   