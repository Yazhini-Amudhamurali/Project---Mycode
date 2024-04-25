package oops;

interface Interface01 {
	abstract void rose();
	abstract void jasmine();
	abstract void sunflower();

}
class Inter02 implements Interface01{
	
	public void rose() {
	System.out.println("rose")	;
		}
	public void jasmine() {
		System.out.println("jasmine");
	}
	public void sunflower() {
		System.out.println("sunflower");
	}

}
class Inter03{
	public static void main(String []args) {
		
		Inter02 obj = new Inter02();
		obj.rose();
		obj.jasmine();
		obj.sunflower();
		
	}
}



