public class pe4{

public static Boolean isPalindromic(String s)
{
	String rev="";
	for(int i=s.length()-1;i!=-1;i--)
		{
		rev+=s.charAt(i);
		}
	if(s.equals(rev)){return true;}
	else{return false;}
}

public static void main(String[] args)
{
	int max=0;
	for(int i=100;i<=999;i++)
		{
		for(int j=100;j<=999;j++)
			{
			if(isPalindromic(i*j+""))     // integer to string conversions
				{
				if(max < i*j)
					{
					max = i*j;
					}
				}
			}
		}
	System.out.println(max);
}

}