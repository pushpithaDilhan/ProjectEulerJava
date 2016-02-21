import java.math.*;

public class pe10{
public static void main(String[] args){

BigInteger sum=BigInteger.valueOf(2);

for(int i=3;i <= 2000000 ;i+=2){
   if(isPrime(i)){sum=sum.add(BigInteger.valueOf(i));}
}
System.out.println(sum);

}


public static boolean isPrime(int n){
for(int j=3 ; j < (int)(Math.sqrt(n)+ 1 ); j+=2){
   if(n%j==0){return false;}
}
return true;
}


}