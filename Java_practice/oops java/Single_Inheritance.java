package oops;

public class Single_Inheritance {
	public void country() {
		System.out.println("india");
	}

}
class single02 extends Single_Inheritance{
	
	public static void main(String[]arg) {
		Single_Inheritance obj1 = new Single_Inheritance();
		obj1.country();
	}
}