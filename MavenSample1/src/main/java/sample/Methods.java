package sample;
public class Methods 
{
	int a,b,sum;
	float d;
	int x=10;
	int c[];
	int e[][]= {{1,2,3},{4,5,6}};
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
	public void array()
	{
		int c[]= {2,4,6,8,10};
		int d[]=new int[5];
		System.out.println("Matrix1");
		for(int i=0;i<c.length;i++)
			System.out.println(+c[i]);
		System.out.println("Matrix2");
		for(int j=0;j<d.length;j++)
		{
			d[0]=1;
			d[1]=3;
			d[2]=5;
			d[3]=7;
			d[4]=9;
			System.out.println(d[j]);
		}
		System.out.println("Matrix3");
		for (int k=0;k<e.length;k++)
		{
			for(int l=0;l<e[k].length;l++)
			{
				System.out.println(e[k][l]);
			}
		}			
	}
	public static String display()
	{
		String s="Hello";
		return s;
	}
}
