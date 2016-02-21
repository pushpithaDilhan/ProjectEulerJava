import javax.swing.*;

public class pe3
{
	public static void primeFactors(long num)
	{
	if(num==1){return;}
	else
		{
		for(int i=2;i<=num;i++)
			{
			if(num%i==0)
				{
				System.out.println(i);
				primeFactors(num/i);
				return;
				}
			}
		}
	}

	public static void main(String[] args)
	{
	String input = JOptionPane.showInputDialog("Enter the number :");
	long num = Long.parseLong(input);
	primeFactors(num);
	}
}