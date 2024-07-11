package sample;
import java.util.Scanner;
public class Operator
{
	int c=10,d;
	public Operator()
	{
		System.out.println("Postincrement addition:"+ c++);
		System.out.println("Preincrement addition:"+ ++c);
		System.out.println("Postdecrement subtraction:"+ c--);
		System.out.println("Predecrement subtraction:"+ --c);
	}
	public void Assignment()
	{
		d=c;
		System.out.println("Assignment operator checking");
		if(d==c)
			System.out.println("Value same");
		else
			System.out.println("Different value");
	}
	public void Local()
	{
		int e;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value for local variable");
		e=sc.nextInt();
		System.out.println("Local Variable:"+e);
	}
}
