package sort;

public class Test02 {
	public static void main(String[] args) {
		
		int score[] = new int[]{50,80,95,60,90};
		
		int max=score[0];
		
		for(int i=0; i<score.length; i++) {
			if(score[i]>max) {
				max=score[i];
			}
		}System.out.println("가장 점수가 높은 학생 : "+max);
	}
}
