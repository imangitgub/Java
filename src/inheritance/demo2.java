package inheritance;


class C
{
int c;
void display()
{
	System.out.println(c);
}
} 

class D extends C
{
	int d;
	void print()
	{
		System.out.println(d);
	}
	
}
class E extends D
{
	int e;
	void show()
	{
		System.out.println(e);
		
	}
}



public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		E cobj= new E();
	    cobj.c=10;
	    cobj.d=20;
	    cobj.e=30;
	    
	    cobj.display();
	    cobj.print();
	    cobj.show();

	}

}


















































