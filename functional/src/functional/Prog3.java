package functional;
import java.util.*;
public class Prog3 {
	public static void main(String args[])
	{
		int y;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any year to check whether it is leap or not:");
		y=sc.nextInt();
		if(y%400==0 || y%100!=0 & y%4==0)
			System.out.println(y+" year is leap year");
		else
			System.out.println(y+" year is not leap year");
	}

}
