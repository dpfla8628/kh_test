package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test03_arr {
	public static void main(String[] args) throws Exception {
		
		File target = new File("file","numbers.kh");
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		ObjectOutputStream object = new ObjectOutputStream(buffer);
		
		int[] arr = new int[] {3,5,2,1,4};
		
		//출력
		object.writeObject(arr);
		//종료
		object.close();
	}

}
