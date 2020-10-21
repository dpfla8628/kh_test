package add;

public class Test01 {
	public static void main(String[] args) {
		Info a[]= new Info[3];
		
		a[0]=new Info("이오리",80,70);
		a[1]=new Info("김갑환",70,90);
		a[2]=new Info("최번개",100,45);
		
		int sum = a[0].getJava_score()+a[0].getJsp_score();
		System.out.println(sum);
		
		double avg = sum/2;
		System.out.println(avg);
		
	}

}
