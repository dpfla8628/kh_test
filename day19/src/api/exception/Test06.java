package api.exception;

public class Test06 {
	public static void main(String[] args) {
	//예외전가를 마주하는 상황들
		
		for(int i=10; i>=10; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000L);//1000밀리초(1초)
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
