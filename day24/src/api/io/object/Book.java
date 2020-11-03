package api.io.object;

import java.io.Serializable;

public class Book implements Serializable{

	private String title;
	private int price;
	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	
	public Book() {}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public void fileSave(String title) {
		this.title=title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}	
	
}