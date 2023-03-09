class A 
	{
				int i, j;
				void showi()
		{
				System.out.println("i " + i );
		}
	}
		class B extends A 
		{
			int j;
			void showj()
			{	
			System.out.print("j" +j);
			}

			// void sum()
			// {
			// 	System.out.println(" i + j + k"+(i + j + k));
			// 	//	return i+j+k;
			// }

		}
		class C extends B{
			int k;
			void showk()
			{
				System.out.println("k : " + k);
			}
			void sum()
			{
				System.out.println("i + j + k" + (i+j+k));
			}
		}
			class MultiLevelInheritance 
			{
	public static void main(String[] args)
	{
		C subOb = new C();
		subOb.i = 10;
		subOb.j = 20;
		subOb.k = 30;

		System.out.print("content  of  subob  :");
		subOb.showi();
		subOb.showj();
		subOb.showk();
		System.out.println();
		System.out.println("Sum of i, j and k in subOb");
		subOb.sum();
	}
}
