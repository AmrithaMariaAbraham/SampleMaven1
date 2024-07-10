package sample;
public class Output 
{
	public static void main(String[] args)
	{
		System.out.println("Hi");
		Methods obj=new Methods();
		obj.getValue(11,14);
		obj.arithmetics();
		obj.ImplicitTypeCasting();
		Methods.ExplicitTypeCasting();
		Operator obj1=new Operator();
		obj1.Assignment();
		obj1.Local();
	}
}
