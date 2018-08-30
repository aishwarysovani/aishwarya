package functional;
import java.util.*;
public class prog11 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float x1=(float)0.0;
		float y1=(float)0.0;
		System.out.println("enter value for x2 and y2 for point");
		float x2=sc.nextFloat();
		float y2=sc.nextFloat();
		double e=Math.sqrt((x2-x2)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("Eucludean distence="+e);
		
	}

}
