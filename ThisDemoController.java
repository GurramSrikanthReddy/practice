public class ThisDemoController{

	public static void main(String args[]){

	ThisDemo t1 = new ThisDemo();
	t1.id = 123;
	t1.name = "Srikanth";
	t1.getMyDetails();

	ThisDemo t2 = new ThisDemo(456,"Vishnu");
	t1.getMyDetails();


	}
}
