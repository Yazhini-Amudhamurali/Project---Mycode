package oops;

public class MultiLevel_Inheritance {
	public void gender() {
		System.out.println("Enter your gender from the list");
		
	}

}
class Multi02 extends MultiLevel_Inheritance{
	public void male() {
		System.out.println("male");
		
	}
	
}
class Multi03 extends Multi02{
	public void female() {
		System.out.println("female");
	}
}
class Multi04 extends Multi03{
	
	public void transgender() {
		System.out.println("transgender");
	}
}
class Multi05{
	public static void main(String[]arg) {
		Multi04 obj = new Multi04();
		obj.gender();
		obj.male();
		obj.female();
		obj.transgender();
		
	}
	
	
}









