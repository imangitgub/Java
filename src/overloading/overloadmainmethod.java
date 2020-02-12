package overloading;

public class overloadmainmethod {

	public  void main(int x) {
		
		System.out.println(x);
	}
			
			public  void main(int x, int y) {
				System.out.println(x+y);
			}
		
		
		
		
		public static void main(String[] args) {
			
			overloadmainmethod co = new overloadmainmethod();
			co.main(100);
			co.main(200);
				
			

	}

}
