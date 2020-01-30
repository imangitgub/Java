package Switch;

public class switchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day = 1;

		switch (day) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("teusday");
			break;
		case 4:
			System.out.println("wedensday");
			break;
		case 5:
			System.out.println("thurday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("saturday");
			break;
		default:
			System.out.println("invalid week number");
			break;

		}

	}

}
