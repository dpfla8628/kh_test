package calender;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test05 {
	public static void main(String[] args) {
		
		int year = 2020;
		int month = 10;
		
		//1.계산파트
		//규칙을 찾아보니까 1일이 무슨 요일이냐에 따라 앞에 출력되는
		//전달 날짜 수가 다르더라
		//1) year과 month에 해당되는 달의 1일로 달력을 설정한다
		// : 1일의 요일을 찾고, 일요일부터 출력하는 날짜를 계산해서 뒤로 돌린다
		
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);
		
		int week = c.get(Calendar.DAY_OF_WEEK);
		//System.out.println("week= "+week);
		
		//week에 들어있는 숫자 -1만큼 이전 날짜로 이동해라
		c.add(Calendar.DATE, -(week-1));
		
		
		//2.출력파트
		//오늘부터 42일을 출력
		
		System.out.println("일\t월\t화\t수\t목\t금\t토\t일");
		
		//*SimpleDateFormat f = new SimpleDateFormat("d(E)");
		
		int count =1;
		for(int i=0; i<42; i++){
		//*	Date d = c.getTime();
		//*	System.out.print(f.format(d));
			System.out.print(c.get(Calendar.DATE));
			
			if(count % 7 ==0) {
				System.out.print("\n");
			}
			else {
				System.out.print("\t");
			}
			count++;
			
			c.add(Calendar.DATE, 1);//날짜에 1일 더해가기
			
		}
	}
}
