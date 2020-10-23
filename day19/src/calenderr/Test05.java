package calenderr;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("연도를 입력하세요 : ");
		int year = s.nextInt();
		System.out.print("월을 입력하세요 : ");
		int month = s.nextInt();
		System.out.print("일\t월\t화\t수\t목\t금\t토");
		
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR,year);//년
		c.set(Calendar.MONTH,month-1);//월
		c.set(Calendar.DATE,1);
		int num = c.get(Calendar.DAY_OF_WEEK)-1;
		//0일 1월 2화 3수 4목 5금 6토
		
		int arr[] = new int[42];//6x7배열
		
		//이번달
		int k=1;
		int max = c.getActualMaximum(Calendar.DAY_OF_MONTH)+num;
		for(int i=num; i<max;i++) {
				arr[i]=k;
				k++;
		}
		//지난달
		c.add(Calendar.MONTH, -1);
		int last=c.getActualMaximum(Calendar.DAY_OF_MONTH);
		for(int i=num-1; i>=0; i--) {
			arr[i]=last;
			last--;
		}
		//다음달
		int reset=1;
		 for(int i=max; i<arr.length; i++) {
			 arr[i]=reset;
			 reset++;
		 }	
		//출력
		for(int i=0; i<arr.length; i++) {
			if(i%7==0) {
				System.out.println();
				System.out.print(arr[i]+"\t");
			}
			else {
			System.out.print(arr[i]+"\t");
			}
		}	
	}
}
