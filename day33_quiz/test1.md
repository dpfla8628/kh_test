##<1>	오버로딩과 오버라이딩의 성립조건을 작성

#1. 오버로딩
메소드 이름이 같음
매개변수의 타입이 다르거나 순서가 다르거나 개수가 다름
(반환타입, 접근제한자 영향 없음)

#2. 오버라이딩
상속 받은 부모 클래스의 메소드와 반환 타입, 이름, 매개변수가 같아야 성립
(접근제한자는 부모 클래스의 메소드와 같거나 넓어야 함)
	
--------------------------------------------

##<3> TCP 소켓 프로그래밍에서 클라이언트 프로그래밍 구현 순서를 기술하시오.

#ip/port -> 연결(소켓) -> 스트림 -> 통신 -> 종료

<클라이언트용 프로그램>
#1. 서버가 정한 포트번호와 서버의 IP 주소가 필요함

#2. 클라이언트용 소켓 객체 생성함
Socket 소켓레퍼런스 = new Socket(서버 IP, 포트번호);
//객체 생성시 서버와 자동 연결 요청함
//연결이 실패하면, null 리턴됨
=> 연결을 끊고나서, 다시 연결을 원할 때는 connect() 메소드 사용함.

#3. 서버와의 입출력 스트림을 오픈함
InputStream input스트림레퍼런스 =
클라이언트소켓레퍼런스.getInputStream(클라이언트소켓레퍼런스);
OutputStream output스트림레퍼런스 =
클라이언트소켓레퍼런스.getOutputStream(클라이언트소켓레퍼런스);

#4. 보조스트림을 붙여 성능을 개선해도 됨.
바이트스트림을 문자스트림으로 변경해도 됨.
예를 들면
//입력용 스트림
BufferedReader 레퍼런스 = new BufferedReader(
new InputStreamReader(input스트림레퍼런스));
//출력용 스트림
PrintWriter 레퍼런스 = new PrintWriter(output스트림레퍼런스);

#5. 스트림을 통한 읽고 쓰기함
읽기용레퍼런스.read() or 읽기용레퍼런스.readLine()
쓰기용레퍼런스.println()
*** 참고 : 버퍼 이용시 출력의 경우 println() 메소드 사용 후
쓰기용레퍼런스.flush(); //버퍼비우기
반드시 사용함

#6. 통신을 종료하려면,
입력스트림레퍼런스.close();
출력스트림레퍼런스.close();
소켓레퍼런스.close();

--------------------------------------------

##<4>	프로세스(process)와 쓰레드(thread)에 대해 기술

#프로세스 
: 실행 중인 프로그램을 의미하며, 자원(resources)과 쓰레드로 구성된다.
#쓰레드 
: 프로세스 내에서 실제 수행되는 작업의 한 단위를 의미하며, 모든 프로세스는 하나이상의 쓰레드를 가지고 있다.

--------------------------------------------

##<5>	Java GUI에서 이벤트의 종류

KeyEvent, MouseEvent, ItemEvent, ActionEvent, TextEvent 등

--------------------------------------------

##<6>	IO에서 기반 스트림과 보조 스트림의 차이점을 기술하시오.

(필수)기반 스트림은 실제로 데이터가 지나가는 통로이고 
(선택)보조 스트림은 데이터가 지나가지 않고 성능 향상이나 기능 추가 등으로 기반 스트림을 보조해줌.






