package add;

public class I extends Phone{

	public I(String number) {
		super(number);
	}

	@Override
	public void call() {
		System.out.println("아이폰 전화");
		
	}

	@Override
	public void sms() {
		System.out.println("아이폰 문자");
		
	}

}
