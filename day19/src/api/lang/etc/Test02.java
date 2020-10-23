package api.lang.etc;

public class Test02 {
	public static void main(String[] args) {
		//java.lang,System 클래스
		//: 생성자가 없다
		
		//표준 출력
		System.out.println("안녕");
		
		//표준 에러
		System.err.println("안녕");
		
		//운영체제의 시간 정보 불러오기
		//프로그래밍에는 기준시라 불리는 시간이 있다(1970년 1월 1일 0시 0분 0초)
		//*currentTimeMillis() 는 기준시로부터 흐른 총 밀리초를 반환한다
		//=>나타난 시간은 기준시로 부터 ~밀리초가 지난 상태
		long time = System.currentTimeMillis();
		System.out.println("time : "+time);
		
		//프로그램 종료
		//System.exit(0);
		//System.out.println("hello");//출력 불가
		
		//운영체제의 각종 상태 불러오기
		//getProperty
		System.out.println(System.getProperties());
		//os.name에 연결된 value를 불러와라
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.version"));
		//자바 버전
		System.out.println(System.getProperty("java.specification.version"));
		//언어
		System.out.println(System.getProperty("user.language"));
		
	}

}
