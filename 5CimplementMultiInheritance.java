interface A
	{
		void showA();
	}
	interface B
	{
		void showB();
	}
	class C implements A,B
	{
		public void showA()
		{
			System.out.println("Implements Interface A");
		}
		public void showB()
		{
			System.out.println("Implements Interface A");
		}
		void showC()
		{
			System.out.println("Class C method ");
		}
	}
	class MultipleInheritance
	{
		public static void main(String[] args) 
		{
			C subOb = new C();
System.out.println("Contents of subOb : ");
			subOb.showA();
			subOb.showB();
			subOb.showC();
		}
	}
