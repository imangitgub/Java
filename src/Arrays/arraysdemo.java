package Arrays;

public class arraysdemo {

	public static void main(String[] args) {

		// int a=1,2,3,3,4,4,5,5,6,6,7,7,;

		// arrays: arrays is collection of elements of the same data type
		// 2 types of arrays
		// 1) single dimensional
		// 2) two/multi dimensional

		// Single Dimensional Arrays
		// 1) Declare an array
		// 2) Insert values into arrays
		// 3) Find size of an arrays
		// 4) Read values from an arrays
		
		// 1) Declare an array

		int a[] = new int[5]; // declared array with size 5, starting index is 0, last index is 9

		//
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		
		// 3) Find size of an arrays

		System.out.println("length of an array : " + a.length);// print length/size of an arrays
		
		System.out.println(a[2]);
		
		for(int i=0;i<=a.length-1;i++)
			
			System.out.println(a[i]);
	}
		

	}


