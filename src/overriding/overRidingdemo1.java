package overriding;

class bank
{
	double rateofintrest() 
	{
return 0;
	}
}
class citi extends bank 
{
	double rateofintrest()
	{
		return 10.5;
	}
}
 class bofa extends bank 
 {
	 double rateofintrest()
	 {
		 return 5.5;
	 }
 }
 
 class cp1 extends bank 
 {
	 double rateofintrest() 
	 {
		 return 22.5;
	 }
 }



public class overRidingdemo1 {

	public static void main(String[] args) {
	
		citi ci=new citi();
		System.out.println(ci.rateofintrest());
		
		bofa bo=new bofa();
		System.out.println(bo.rateofintrest());
		
		cp1 cp= new cp1();
		System.out.println(cp.rateofintrest());
	

	}

}
;