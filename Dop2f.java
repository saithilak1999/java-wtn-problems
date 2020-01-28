import java.util.*;
class Dop2f
{
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int f=1;
	if(n==0||n==1)
	{
	System.out.println(1);
	}
	else
	{
	for(int i=1;i<=n;i++)
	{
	f=f*i;
	}
	System.out.println("Factorial:"+f);
	}
}
}