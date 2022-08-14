package polymorphism;

public class SamsungTV implements TV {
	public SamsungTV() {
		System.out.println("==> SamsungTV 객체 생성");
	}
	 
	 public void powerOn() { System.out.println( "SamsungTv 전원 켬"); }
	 
	 public void powerOff() { System.out.println( "SamsungTv 전원 끔"); }
	 
	 public void volumeUp() { System.out.println( "SamsungTv 소리 올리기"); }
	 
	 public void volumeDown() { System.out.println( "SamsungTv 소리 내리기"); }
}
