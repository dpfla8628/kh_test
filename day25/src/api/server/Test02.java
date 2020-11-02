package api.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Test02 {
	public static void main(String[] args) throws IOException {
		//받는 프로그램 만들기
		
		//33333번 포트의 내용을 수신하는 우체국 생성
		DatagramSocket ds = new DatagramSocket(33333);
		
		//어느정도의 데이터를 수신할 것인지 미리 정한 다음 수신하도록 도구 생성
		byte[] buffer = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buffer,buffer.length);
	
		//우체국을 이용하여 편지(dp)를 수신
		ds.receive(dp);
		
		//분석
		//내용 복원(String)
		//발신 정보 확인(보낸 대상의 IP, Port)
		String text = new String(dp.getData() , 0 , dp.getLength());//데이터, 시작, 개수
		System.out.println(text);
		
		InetAddress addr = dp.getAddress();//IP정보 객체
		System.out.println(addr);
		
		int port = dp.getPort();
		System.out.println(port);
		
		//우체국 폐쇄
		ds.close();
	
	}

}
