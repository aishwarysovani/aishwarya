package functional;
import java.util.*;
public class Prog15 {
	public static void main(String args[])
	{
	float a,b,c;
	double r1,r2;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter values of a,b and c:");
	a=sc.nextFloat();
	b=sc.nextFloat();
	c=sc.nextFloat();
	float delta=b*b-4*a*c;
	r1=(-b+Math.sqrt(delta))/(2*a);
	r2=(-b-Math.sqrt(delta))/(2*a);
	System.out.println("root of equation for a b c values:"+r1+" and"+r2);
	}
}