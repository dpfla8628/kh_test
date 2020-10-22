package api.lang.string;

public class Test03 {
	public static void main(String[] args) {
		//포함 검사
//contains() : 단순하게 포함 되어 있는지 아닌지만
//indexOf()/lastIndexOf():포함된 위치
		
		String url = "http://www.naver.com";
		
		System.out.println(url.contains("naver"));
		System.out.println(url.indexOf("naver"));//앞에서 뒤로 검색, naver가 몇번째에 있는지 찾아냄
		System.out.println(url.lastIndexOf("naver"));//뒤에서 앞으로 검색, "
		System.out.println(url.indexOf("daum"));//없으면 -1
		
		//여러개를 찾고 싶으면
		System.out.println(url.indexOf("."));//처음부터 .을 찾아라=10
		System.out.println(url.indexOf(".",11));//11번 위치부터 .을 찾아라 =16
		
		
	}

}
