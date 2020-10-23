package calender;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test02 {
	public static void main(String[] args) {
		//Calendar는 Date와 호환이 가능할까??
		
		//Calendar는 날짜변경과 계산에 특화
		//Date는 날짜 출력이 쉽다

		
		Calendar c = Calendar.getInstance();
		
		//정보 설정 : .set(항목, 값)
		
		//Q1.연도를 2021년으로 변경
		// 2. 월을 5월로 변경
		// 3. 일을 3일로 변경
		
		c.set(Calendar.YEAR,2021);
		c.set(Calendar.MONTH,4);//설정할 때 -1
		c.set(Calendar.DATE,3);
		
		//=c.set(2021,4,3);
		
		
		//.getTime() : Calendar의 날짜 정보를 Date로 옮김
		Date d = c.getTime();
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
		System.out.println(f.format(d));
	}

}
