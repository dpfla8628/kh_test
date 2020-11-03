package api.server2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Test03_2 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		String addr = "127.0.0.1";
		int port = 33333;
		Socket socket = new Socket(addr,port);
		
		OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
		BufferedWriter bw = new BufferedWriter(osw,8192);
		PrintWriter pw = new PrintWriter(bw);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("입력:");
			String input = sc.nextLine();
			pw.println(input);
			pw.flush();
			
			if(input.equals("종료"))
				break;
		}
		sc.close();
		socket.close();
		
	}
}
