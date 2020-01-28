import java.util.*;
class Dop2c
{
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	int s=0,temp,r;
	System.out.println("Enter a value:");
	int n=sc.nextInt();
	temp=n;
	while(n>0)
	{
	r=n%10;
	s=(s*10)+r;
	n=n/10;
	}
	if(temp==s)
	System.out.println("is a palindrome");
	else
	System.out.println("is not a palindrome");
}
}
