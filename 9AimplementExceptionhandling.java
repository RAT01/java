class exc2
{
	public static void main(String args[])
	{
	int d,a;
	try{
	d=0;
	a=42/d;
	System.out.println("This will not printed");
	}
	catch(ArithmeticException e)
	{
	System.out.println("Division by zero");
	}
	System.out.println("After catch Statement");
	}
}
