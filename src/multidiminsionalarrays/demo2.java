package multidiminsionalarrays;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 100, 200 }, { 300, 400 }, { 500, 600 } };

		System.out.println("number of rows:" + a.length);
		System.out.println("number of colums:" + a[0].length);

		// enhanced for loop

		for (int r[] : a)

		{
			for (int i : r)

			{

				System.out.println(i);
			}

		}

	}
}
