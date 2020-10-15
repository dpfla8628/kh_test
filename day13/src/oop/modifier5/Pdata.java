package oop.modifier5;

public class Pdata {
	private String name;
	private int height,weight;
	
	//Setter============================
	public void setName(String name) {
		this.name=name;
	}
	public void setHeight(int height) {
		if(height<=0) return;//종료
		this.height=height;
	}
	public void setWeight(int weight) {
		this.weight=weight;
	}
	
	//Getter==============================
	//존재하지 않는 변수도 getter 메소드를 가질 수 있다
	//(=>setter는 기존의 변수로 처리!)
	
	//키는 cm로 관리되지만 m도 알고 싶다!
	public double getHeightMeter() {
		return this.height/100.0;
	}
	//bmi도 그냥 만들어버리자!
	public double getBmi() {
		//	   this.weight()   도 가능
		return this.getWeight()/this.getHeightMeter()/this.getHeightMeter();
	}
	
	public String getName() {
		return this.name;//name을 반환하고 종료
	}
	public double getHeight() {
		return this.height;
	}
	public double getWeight() {
		return this.weight;
	}
	
	//정보 입력=============================
	public void inform(String name, int height, int weight) {
		 this.setName(name);
		 this.setHeight(height);
		 this.setWeight(weight);
		/*
		this.name=name;
		this.height=height;
		this.weight=weight;*/
	}
	
	//출력================================
	public void print() {
		System.out.println("이름 \t: "+this.name);
		System.out.println("키(cm) \t: "+this.height+"cm");
		System.out.println("몸무게(kg): "+this.weight+"kg");
		if(this.name=="이소룡") {
			System.out.println("BMI \t : "+this.getBmi());
		}
		System.out.println("=========================");
	}

}
