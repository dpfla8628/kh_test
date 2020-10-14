package oop.method3;

public class Score {
	String name;
	int grade,kor,eng,math;
	
	void setName(String name) {
		this.name=name;
	}
	void setGrade(int grade) {
		/*switch(grade) {
		case 1: case 2: case 3:
			this.grade=grade;
		}*/
		if(grade<1||grade>3) return;
		this.grade=grade;
	}
	void setKor(int kor) {
		if(!(kor>=0 && kor<=100)) return;
			this.kor=kor;
	}
	void setEng(int eng) {
		if(eng>=0 && eng<=100) {
			this.eng=eng;
		}
	}
	void setMath(int math) {
		if(math>=0 && math<=100) {
			this.math=math;
		}
	}

	void info(String name, int grade, int kor, int eng, int math) {
		this.setName(name);
		this.setGrade(grade);
		this.setKor(kor);
		this.setEng(eng);
		this.setMath(math);
	}
	
	void print() {
		System.out.println("이름 \t : "+this.name);
		System.out.println("학년 \t : "+this.grade);
		System.out.println("국어점수 \t : "+this.kor);
		System.out.println("영어점수 \t : "+this.eng);
		System.out.println("수학점수 \t : "+this.math);
		int sum=this.kor+this.eng+this.math;
		double avg=sum/3.0;
		System.out.println("총점 \t : "+sum);
		System.out.println("평균 \t : "+avg);
		System.out.println("--------------------");
	}
}
