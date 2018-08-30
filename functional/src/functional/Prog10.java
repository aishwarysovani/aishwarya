package functional;
import java.util.*;
public class Prog10 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the no:");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(a[i]+a[j]+a[k]==0)
						System.out.println("get triplets="+a[i]+" "+a[j]+" "+a[k]);
				}
			}
		}
		System.out.println("triplets not get");
	}

}
