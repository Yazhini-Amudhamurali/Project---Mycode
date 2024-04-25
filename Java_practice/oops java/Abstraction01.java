package oops;

abstract class Abstraction01 {
	abstract void games();
	public void outdoorGames() {
		System.out.println("outdoor games");
	}

}
class Abs02 extends Abstraction01{
	public void indoorGames() {
		System.out.println("indoor games");
	}
public void games() {
	System.out.println("games");
}
	

}
class School{
	public static void main(String [] arg) {
		Abs02 obj = new Abs02();
		obj.games();
		obj.indoorGames();
		obj.outdoorGames();
	}
}