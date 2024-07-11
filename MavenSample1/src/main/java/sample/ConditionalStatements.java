package sample;
public class ConditionalStatements extends Methods
{
	public void fi()
	{
	if(a>18)
		System.out.println("Eliglible for voting");	
	else if(a<18)
		System.out.println("Not Eligible for voting");
	else if (a==18)
		System.out.println("Eliglible for voting");	
	else 
		System.out.println("Default case");
	}
}
