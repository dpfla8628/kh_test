package api.io.object;

import java.io.Serializable;

//이 클래스가 객체 입출력을 위한 "자격"을 획득하려면 반드시 상속 받아야함
//java.io.Serializable 인터페이스(마킹 인터페이스 : 자격 부여를 위한 인터페이스)

public class Student implements Serializable{
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name=name;
		this.score=score;
	}

}
