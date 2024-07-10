package sample;

public class Methods 
{
	int a,b,sum;
	float d;
	int x=10;
	static float w=10.0f;
	public void getValue(int a,int b)
	{
		this.a=a;
		this.b=b;	
	}
	public void arithmetics()
	{
		sum=a+b;
		System.out.println("Sum:"+sum);
	}
	public void ImplicitTypeCasting()
	{
		System.out.println("Before Implicit Typecasting:"+x);
		float y=x;
		System.out.println("After Implicit Typecating:"+y);
	}
	public static void ExplicitTypeCasting()
	{
		System.out.println("Before Explicit Typecasting:"+w);
		int x=(int)w;
		System.out.println("After Implicit Typecasting:"+x);
	}
}
