package oops;

public class Encapsulation01 {
	private String name;
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		
		this.name = newName;
		
	}
	
	public static void main(String[]args) {
		Encapsulation01 obj = new Encapsulation01();
		obj.setName("yazhini");
		System.out.println(obj.getName());
		
		
		
		
	}
	

}
