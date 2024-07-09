package sample;
public class Operator
{
	int c=10;
	public Operator()
	{
		System.out.println("Postincrement addition:"+ c++);
		System.out.println("Preincrement addition:"+ ++c);
		System.out.println("Postdecrement subtraction:"+ c--);
		System.out.println("Predecrement subtraction:"+ --c);
	}
}
