/*##Test05
 * 낮에는 3cm올라가고 밤에는 2.5cm내려갑니다.
 * 나무의 높이가 15cm라고 할 때 다 올라가는데 며칠이 걸릴까요?
 */
package loop2;
public class Test04 {
	public static void main(String[] args) {
		
		int tree=15;//나무의 높이
		int up=3;//낮에 올라가는 높이
		double down=2.5;//밤에 내려가는 높이
		double height=0;//달팽이가 올라가고 있는 높이
		int day=0;//달팽이가 다 올라가는데 걸리는 날짜
		
		while(true) {
			height+=up;
			day++;
			if(height==tree) {
				System.out.println("총 " + day +"일이 걸렸다.");
				break;
			}height-=down;
		}
	}
}
