package oop;

public class constructor {
	
	int sid;
	String sname;
	char grade;
	
	//constructor
	
	constructor (int id,String name,char g)
	{
	sid=id;
	sname=name;
	grade=g;
	}
	
	void dispaly()
	{
	System.out.println(sid+" "+sname+" "+grade);

}
}
