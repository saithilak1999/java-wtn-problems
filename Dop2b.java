import java.util.*;
class Dop2b
{
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	int c=0;
	System.out.println("Enter a value:");
	int n=sc.nextInt();
	if(n==0||n==1)
	System.out.println("The number "+n+" is neither prime nor composite");
	else{
	for(int i=2;i<=(n/2);i++)
	{
		if(n%i==0)
		{
		c++;
		break;
		}
	}
	if(c>=1)
	System.out.println("is not a prime");
	else
	System.out.println("is a prime");}
}
}
