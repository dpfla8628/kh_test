package thread;

public class Test06 {
	public static void main(String[] args) {
		//스레드를 생성하는 또다른 방법
		//Runnable 활용
		//Runnable은 함수형 인터페이스라서 start()가 없기때문에 Thread를 사용해야한다
		
//		Runnable r = new Runnable() {
//			@Override
//			public void run() {
//				//스레드에서 구동될 코드 작성
//				System.out.println("커스텀 스레드!");
//			}
//		};
		
		//람다형 가능
		Runnable r = () ->{
			System.out.println("커스텀 스레드!");
		};
		
		//r.start();
		Thread t = new Thread(r);
		t.setDaemon(true);//종속계약
		t.start();
		
		//메인에서 구동될 코드를 작성
		System.out.println("메인 스레드!");
	}

}
