public class pe2{
public static int fibo(int n)
{
	if(n==0 || n==1){return n;}
	else{return (fibo(n-1)+fibo(n-2));}
}
public static void main(String args[])
{
	int s=0;
	for(int i=1;i<4000000;i++)
	{
		if(fibo(i)>4000000){break;}
		if(fibo(i)%2==0)
			{
				s+=fibo(i);
			}
	}	
	System.out.println(s);
}
}
