public class pe7{
public static void main(String[] args){

int num=13;
int counter=5;

while(true)
{
if(isPrime(num)){counter+=1;}
if(counter==10001){break;}
num+=2;
}

System.out.println(num);
}


public static boolean isPrime(int n)
{
for(int j=3 ; j < (int)(Math.sqrt(n)+ 1 ); j+=2){
   if(n%j==0){return false;}
}
return true;
}

}
