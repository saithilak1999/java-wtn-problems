import java.util.*;
class Dop2a
{
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a value:");
	int a=sc.nextInt();
	if(a<0)
	System.out.println("The number "+a+" is negative number");
	else if(a>0)
	System.out.println("The number "+a+" is positive number");
	else
	System.out.println("The number "+a+" is neither positive nor negative number");
}
}