package functional;
import java.util.*;
public class Prog13 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float t1,t2;
		System.out.println("enter start time:");
		t1=sc.nextFloat();
		System.out.println("enter end time:");
		t2=sc.nextFloat();
		float t=t2-t1;
		System.out.println("Elapsed time of stopwatch="+t);
	}

}
