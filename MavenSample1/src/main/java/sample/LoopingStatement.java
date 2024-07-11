package sample;
public class LoopingStatement extends Methods
{ 
	int n=5;
	public void loop()
	{
	/*
	for(int i=0;i<a;i++)
		{
		  System.out.println("Welcome to Java class");
		}
	*/
		for(int i=0;i<5;i++)
		{
		  System.out.println("Welcome to Java class");
		}
	}
	public void whileloop()
	{
		/*
		  while(b==5)
		{
			System.out.println("While loop:"+b);
			b--;
		}
		  */
		while(n==5)
		{
			System.out.println("While loop:"+n);
			n--;
		}
	}
}

