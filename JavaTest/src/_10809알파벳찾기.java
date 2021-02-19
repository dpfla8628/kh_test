import java.util.Scanner;
 
public class _10809알파벳찾기 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		
		for(int i=0; i<arr.length; i++){
			arr[i]=-1;
		}
		
		String str = sc.nextLine();
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(arr[c-'a']==-1) {
			arr[c-'a']=i;
			}
		}
		for(int k : arr) {
			System.out.print(k+" ");
		}
	}
}