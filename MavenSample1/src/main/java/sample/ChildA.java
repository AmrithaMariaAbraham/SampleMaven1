package sample;
public class ChildA extends Parent
{
	int a=2,b=6,sum;
	public void add()
	{
		sum=a+b;
		System.out.println("SUM:"+sum);
	}
	public static void main(String[] args)
	{
		Parent obj=new Parent();
		obj.display();
	}
	
}