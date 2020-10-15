package opp.modifier5;

public class Test01 {
	public static void main(String[] args) {
		//2.빈 객체 생성
		Pdata a1= new Pdata();
		Pdata a2= new Pdata();
		Pdata a3= new Pdata();
		//1.객체에 정보 설정
		a1.inform("이소룡", 170, 60);
		a2.inform("성룡", 175, 70);
		a3.inform("홍금보", 180, 100);
		//순서 이상 => 정보를 설정하며 객체를 만들자(=>생성자!!)
		
		double avg=(a1.getHeight()+a2.getHeight()+a3.getHeight())/3.0;
		System.out.println("세명의 키 평균 : "+avg+"\n");
		
		//BMI = 체중(kg) / 키(m) / 키(m) = 키(cm)*100
		//double bmi=(a1.getWeight()/a1.getHeightMeter()/a1.getHeightMeter());
		//System.out.println("이소룡의 BMI\t: "+bmi);
		//=System.out.println(a1.getBmi());
		
		a1.print();
		a2.print();
		a3.print();
		
		
		
		
	}

}
