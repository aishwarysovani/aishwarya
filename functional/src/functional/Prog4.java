package functional;
import java.util.*;
public class Prog4 {
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter total no:");
		n=sc.nextInt();
		if(n>31)
			System.out.println("enter no between 1 to 31");
		int a[]=new int[n];
		System.out.println("enter "+n+" numbers");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int b[]=new int[n];
		System.out.println("number   square");
		for(int i=0;i<n;i++)
		{
			//System.out.println(a[i]);
			b[i]=a[i]*a[i];
			System.out.println(a[i]+"         "+b[i]);
		}
	}

}
