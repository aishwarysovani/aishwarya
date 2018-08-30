package functional;
import java.util.*;
public class Prog2 {
	public static void main(String args[])
	{
		//Random r=new Random();
		Scanner sc=new Scanner(System.in);
		System.out.println("how many times coin will flip?");
		int n=sc.nextInt();
		float r1[]=new float[5];
		System.out.println("enter any random no between 0 to 1");
		for(int i=0;i<5;i++)
		{
		r1[i]=sc.nextFloat();
		}
		//System.out.println(r1);
		
		int flip=0,flip1=0;
		for(int j=0;j<5;j++)
		{
			if(r1[j]<0.5)
				flip++;
			else
				flip1++;
		}
		int f1=flip/n*100;
		int f2=flip1/n*100;
		System.out.println("head will flip="+f1);
		System.out.println("tail will flip="+f2);
	}
}
