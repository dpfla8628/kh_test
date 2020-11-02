package api.server;
//UDP 통신
//: 사용자가 받았다고 확신할 수 없지만 빠르다
//DatagramSocket , DatagramPacket

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

//IP,PORT
public class Test01 {
	public static void main(String[] args) throws IOException {
		//통신을 하려면 반드시 프로그램이 2개가 실행되어야한다
//		보내는 프로그램(sender)
//		받는 프로그램(receiver)
		
//		보내는 프로그램 만들기
//		문자 또는 우편과 유사한 방식의 통신인 UDP 방식을 구현
//		DatagramSocket : 전송 도구(우체국)
//		DatagramPacket : 전송할 데이터(편지) : 받을 사람의 주소(IP,Port) + 내용(String)
		
		String text = "우와 신기하당";
		
		DatagramSocket ds = new DatagramSocket();
		DatagramPacket dp = new DatagramPacket(
				text.getBytes(),					//내용
				text.getBytes().length,				//크기
				InetAddress.getByName("112.221.47.69"),	//IP
				33333								//Port	
				);
		
//		우체국(ds)을 이용해서 편지지(dp)를 전송한다
		ds.send(dp);
		
//		우체국 영업 종료
		ds.close();
		
		
	}

}
