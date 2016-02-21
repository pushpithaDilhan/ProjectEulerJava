public class pe5{
public static int gcd(int m,int n)
	{
	if(m%n==0)
		{
		return n;
		}
	else
		{
		return gcd(n,m%n);
		}
	}

public static int lcm(int m,int n)
	{
	return (m*n)/gcd(m,n);
	}

public static void main(String[] args)
{
	int s=1;
	for(int i=1;i<20;i++)
		{
		s=lcm(s,i);
		}
	System.out.println(s);
}
}		