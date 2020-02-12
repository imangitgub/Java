package thiskeyword;

public class ThisDemo1 {

	// TODO Auto-generated method stub

	int a, b;// instance variable

	void getValues(int a, int b) // method variable
	{
		this.a = a;
		this.b = b;
	}

	void printValues()

	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {

		ThisDemo1 th = new ThisDemo1();
		th.getValues(10, 200);
		th.printValues();
		
		// Keyword "this" is a reference in java that refers to current object 
		
	}
	

}
