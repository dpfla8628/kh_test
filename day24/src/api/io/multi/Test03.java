package api.io.multi;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test03 {
	public static void main(String[] args) throws Exception {
		File target = new File("file","numbers.kh");
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		DataOutputStream data = new DataOutputStream(buffer);
		
		int arr[] = new int[] {3,5,2,1,4};
		
		for(int n : arr) {
			data.writeInt(n);
		}	
		data.flush();
	}
}
