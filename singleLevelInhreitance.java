class A 
	{
				int i, j;
				void showij()
		{
				System.out.println("i and j" + i + " " + j);
		}
	}
		class B extends A 
		{
			int k;
			void showk()
			{	
			System.out.print("k" +k);
			}

			void sum()
			{
				System.out.println(" i + j + k"+(i + j + k));
				//	return i+j+k;
			}

		}
			class SimpleInheritance 
			{
	public static void main(String[] args)
	{
		A superOb = new A();
		B subOb = new B();
		superOb.i = 11;
		superOb.j = 23;
		System.out.println("content of superclass :::");
		superOb.showij();
		System.out.println();
		subOb.i = 7;
		subOb.j = 8;
		subOb.k = 9;

		System.out.print("content  of  subob  :::");
		subOb.showij();
		subOb.showk();
		subOb.sum();
		System.out.println("Sum of i, j and k in subOb");
		subOb.sum();
	}
} 
