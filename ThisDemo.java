public class ThisDemo{

int id;
String name;

	// Static Block ->Calls Only One Time After JVM loads .Class File
	static{
	System.out.println("Static Block");
	}

	// Instance Block ->Calls Every Time When We Create Instance/Object
	{
	System.out.println("Instance Block");
	}


	public ThisDemo(){	
	System.out.println("Default constructor");

	}

	public ThisDemo(int id, String name){
 	this();
	System.out.println("Parameterised constructor");
	this.id = id;	
	this.name = name;
	
	}


	public void getMyDetails(){
	System.out.println(id);
	System.out.println(name);
	
	}
}
