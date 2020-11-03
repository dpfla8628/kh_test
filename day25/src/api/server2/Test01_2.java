package api.server2;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test01_2 {
	public static void main(String[] args) throws IOException {
		//TCP 클라이언트 구현
		//연결 생성만 필요(Socket 객체 생성)
		//연결을 위해서는 IP/Port 정보가 필요하다
		//IP는 자기 자신일 경우 127.0.0.1이나 localhost라고 작성 가능
		//Port는 정해둔 값으로 사용(33333)
		
		//준비작업
		//InetAddress addr = InetAddress.getByName("127.0.0.1");
		String addr= InetAddress.getLocalHost().getHostAddress();
		int port = 33333;
		
		//연결(IP,Port)
		//socket() + connect()
		Socket socket = new Socket(addr,port);
		//Socket socket = new Socket("localhost",port);
		
		//열결 이후 수행할 작업
		
		
		//연결 종료
		socket.close();
		
		
	}
	
	
}
