package api.lang.string;

public class Test05 {
	public static void main(String[] args) {
		String address = "HTTP://WWW.NAVER.COM";
		
//toLowerCase : 소문자로
//toUpperCase : 대문자로
		System.out.println(address);
		System.out.println(address.toLowerCase());
		
//불필요한 여백 제거 : trim()
		//글자 사시의 여백은 제거 불가
		//입력창에서 입력할 때 유용
		
		String address2 = "              HTTP://WWW.NAVER.COM";
		System.out.println(address2);
		System.out.println(address.trim().toLowerCase());//연쇄호출(메소드체이닝)
		
//substring : 문자열 자르기
		String name = "최번개";
		System.out.println(name);
		String firstname = name.substring(1);//이름 or (1,3):1부터3까지
		String lastname = name.substring(0,1);//성 : 0부터1까지
		System.out.println("이름 : "+firstname);
		System.out.println("성 : "+lastname);
	}

}
