package add;

public class Test02 {
	public static void main(String[] args) {
		
		int number = (int) Math.random()*5;
		
		Phone a[] = new G[] {
				new G("a"),new G("b"),new G("c"),
				new G("d"),new G("e")};
		Phone b[] = new I[] {
				new I("f"),new I("g"),new I("h"),
				new I("i"),new I("j")};
		
		for(int i=0; i<5; i++) {
			a[i].call();
		}
	}

}
