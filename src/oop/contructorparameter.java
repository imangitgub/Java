package oop;

public class contructorparameter {

	int x;
	int y;

	contructorparameter(int a, int b)
		{
			x=a;
			y=b;
			
		}

	void display() {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		
		contructorparameter cpm1 = new contructorparameter(40,20);
		
		cpm1.display();

	}

}
