import java.util.*;
class Dop2d
{
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	int s=0,r=0;
	while(n!=0)
	{
	r=n%10;
	s=s+r;
	n=n/10;
	}
	System.out.println(s);
}
}