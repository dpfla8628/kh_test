import java.util.*;

public class overlap{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//중복 제거
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int i=0;i<10;i++) {
			h.add(sc.nextInt()%42);
		}
		System.out.print(h.size());
	}
}