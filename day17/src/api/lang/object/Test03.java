package api.lang.object;

public class Test03 {
	public static void main(String[] args) {
		//Student에는 아무것도 없다
		Student st = new Student();
		
		//아무 기능이 없는데 어떻게 불러오지?
		//Object가 최상위니까 포함되어있음
		
		int a = st.hashCode();
		String s = st.toString();
		
		System.out.println(a);
		System.out.println(s);
	}

}
