package api.lang.string;

public class Test01 {
	public static void main(String[] args) {
		/*
		char[] ch = new char[] {'h', 'e', 'l', 'l', 'o', ' ', 'j', 'a', 'v', 'a'};
		String b = new String(ch);
		
		byte[] by = new byte[] {'h', 'e', 'l', 'l', 'o', ' ', 'j', 'a', 'v', 'a'};
		String c = new String(by);
		*/
		String a = new String("Hello java");
		String b = new String("hello java");
		
		System.out.println(a==b);//같은 객체인지
		System.out.println(a.equals(b));//값이 같은지
		System.out.println(a.equalsIgnoreCase(b));//대소문자 무시하고 값 비교
		System.out.println(a.startsWith("Hello"));//Hello로 시작하는지
		System.out.println(b.endsWith("java"));//java로 끝나는지
		System.out.println(a.length());//a글자수
		System.out.println(b.length());//b글자수
	}
}
