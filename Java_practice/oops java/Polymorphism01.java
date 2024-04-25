package oops;

public class Polymorphism01 {
	public void vehicle() {
		System.out.println("car");
	}

}
class Poly02 extends Polymorphism01{
	public void vehicle() {
		System.out.println("bike");
	}
}
class Poly03 extends Poly02{
	public void vehicle() {
		System.out.println("bus");
	}
}
class Poly04{
	public static void main(String[]arg) {
		Polymorphism01 obj1 = new Polymorphism01();
		Polymorphism01 obj2 = new Poly02();
		Polymorphism01 obj3 = new Poly03();
		
		obj1.vehicle();
		obj2.vehicle();
		obj3.vehicle();
	}
}
