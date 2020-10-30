package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test03_list {
	public static void main(String[] args) throws Exception {
		
		File target = new File("file","numbers2.kh");
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		ObjectOutputStream object = new ObjectOutputStream(buffer);
		
		List<Integer> list  = new ArrayList<Integer>();
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(1);
		list.add(4);
		//출력
		object.writeObject(list);
		//종료
		object.close();
	}

}
