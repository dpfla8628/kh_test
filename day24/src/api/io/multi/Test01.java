package api.io.multi;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Test01 {
	public static void main(String[] args) throws Exception {
		//멀티바이트(multibyte)의 입출력
		//int(4), long(8), float, double처럼 byte보다 크지만 원시형
		//원래 형태 그대로 입출력 불가능
		//형태가 다 다르기 때문에 분해하는 방법도 제각각
		
		//멀티바이트 출력
		//준비물 : 파일 객체, 출력용 스트림, 버퍼(스트림), 분해 도구(스트림)
		//byte[]은 제어가 수월하지 않으므로 클래스 형태로 제어하기 쉽게 구성해두었다
		File target = new File("file","multi.txt");
		FileOutputStream  out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out/*8192*/);
		DataOutputStream data = new DataOutputStream(buffer);
		
		//[프로그램]->data->buffer->out->target->[multi.txt]
		//			(분해)  (대기)  (출력)           저장(깨짐)    	
		//출력은 data를 이용하여 진행
		data.writeInt(100);//(4)100을 int 형태로 분해하여 저장(출력)하라
		data.writeChar(100);//2
		data.writeDouble(100);//8
		data.writeLong(100);//8
		data.writeByte(100);//1
		data.writeFloat(100);//4
		
		//대기라인이 8192개 있는데 27명만 있는 경우에 입력이 안된다 .. 왜?
		//버퍼는 애초에 빠른 전송을 위해 임시 저장을 하는 목적으로 만들어졌다
		//8192칸중에 27칸만 사용중이기 때문에 더 들어올거라고 생각한다
		//이대로 프로그램이 끝나면 전송을 안한다
		//해결 : 
		//이제 그만 보낼 예정이니까 그냥 남은 데이터를 전송하라고 말한다(flush)
		data.flush();//강제 전송
		//data.close();//강제 전송 + 통로 소멸 =>(out+buffer.close())
	}
}
