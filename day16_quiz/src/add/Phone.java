package add;

public abstract class Phone {
	protected String number;
	protected int price;
	
	public Phone(String number) {
		this.setNumber(number);	
		}
	
	public Phone(String number, int price) {
		this.setNumber(number);
		this.setPrice(price);
	}
	//추상 메소드
	//:이름은 있지만 코드가 없는 메소드(간판 역할)
	public abstract void call();
	public abstract void sms();

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
