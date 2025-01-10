package interfaceEx;

public class MorningGreet implements Greet {

	// 재정의
	@Override
	public void greeting() {
		System.out.println("Good Morning!");
	}

}
