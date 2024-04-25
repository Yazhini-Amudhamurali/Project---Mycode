package oops;

interface Multi_Interface {
	abstract void chocolate();
	


}
interface Inter01{
	abstract void vannila();
	
}
class Inte02 implements Multi_Interface, Inter01{
	public void chocolate() {
		System.out.println("chocolate");
	}
	public void vannila() {
		System.out.println("vannila");
	}
	
}

class result{
	
	public static void main(String[]args) {
		Inte02 obj = new Inte02();
		obj.chocolate();
		obj.vannila();
		
		
	}
	
}
