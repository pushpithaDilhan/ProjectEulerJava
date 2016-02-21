public class pe36{

public static boolean isPalindrome(String s){
	if(s.equals((new StringBuffer(s).reverse()).toString())){
		return true;
	}
	return false;
   }

public static void main(String[] args){
int sum=0;
for(int i =1;i<1000000;i++){
 if(isPalindrome(Integer.toString(i)) && isPalindrome(Integer.toBinaryString(i))){
    sum+=i;
  }
}
System.out.println(sum);
}


}