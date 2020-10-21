package add;

public class G extends Phone{

	public G(String number) {
		super(number);
	}

	@Override
	public void call() {
		System.out.println("갤럭시 전화");
	}

	@Override
	public void sms() {
		System.out.println("갤럭시 문자");
	}
	
	

}
