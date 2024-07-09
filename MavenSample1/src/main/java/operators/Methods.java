package operators;
public class Methods 
{
	int a,b,sum,c=10;
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
	public Methods()
	{
		System.out.println("Postincrement addition:"+ c++);
		System.out.println("Preincrement addition:"+ ++c);
		System.out.println("Postdecrement subtraction:"+ c--);
		System.out.println("Predecrement subtraction:"+ --c);
	}
	
}
