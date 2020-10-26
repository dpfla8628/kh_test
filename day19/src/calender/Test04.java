package calender;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test04 {
	public static void main(String[] args) {
		//문제 : 2020년 12 월 25일이 100일이 되는 시작 날짜를 구하세요
		//->2020년 12월 25일 - 99일(0포함이니까)
		
		Calendar c = Calendar.getInstance();
		
		//Calendar(Date)등 옛날에 만들어진 클래스들은
		//0부터 11까지를 월로 관리했기 때문에 -1을 해줘야한다
		c.set(2020,11,25);
		
		Date d = c.getTime();
		SimpleDateFormat f = new SimpleDateFormat("y년M월d일");
		System.out.println(f.format(d));
	}

}
