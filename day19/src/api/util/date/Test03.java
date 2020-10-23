package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test03 {
	public static void main(String[] args) {
		//언어 강제 설정
		//Locale.setDefault(Locale.US);
		
		
		Date a = new Date();
		//1.2020년 10월 23일
		SimpleDateFormat f1 = new SimpleDateFormat("y년 M월 d일");//=yyyy-MM-dd
		System.out.println(f1.format(a));
		//2. 20:10:05
		SimpleDateFormat f2 = new SimpleDateFormat("HH:mm:ss");//HH:24시간 단위
		System.out.println(f2.format(a));
		//3. 오후 8:10
		SimpleDateFormat f3 = new SimpleDateFormat("a h:mm");
		System.out.println(f3.format(a));
		//4.2020-10-23 금
		SimpleDateFormat f4 = new SimpleDateFormat("yyyy-MM-dd E");//E요일->금요일
		System.out.println(f4.format(a));
		//5.2020-10-23 금 20:10:05
		SimpleDateFormat f5 = new SimpleDateFormat("yyyy-MM-dd E H:mm:ss");//SSS:밀리초단위
		System.out.println(f5.format(a));
	}

}
