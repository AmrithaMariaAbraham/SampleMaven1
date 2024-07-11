package sample;
public class Output 
{
	public static void main(String[] args)
	{
		System.out.println("Hi");
		Methods obj=new Methods();
		obj.getValue(15,5);
		obj.arithmetics();
		obj.ImplicitTypeCasting();
		obj.array();
		Methods.ExplicitTypeCasting();
		Operator obj1=new Operator();
		obj1.Assignment();			
		ConditionalStatements obj2=new ConditionalStatements();
		obj2.fi();
		LoopingStatement obj3=new LoopingStatement();
		obj3.loop();
		obj3.whileloop();
		obj1.Local();
		System.out.println(Methods.display());
		
		}
}
