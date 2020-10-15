package oop.constructor3;

public class Game {
	private String id, job;
	private int level,money;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		if(!(job=="전사"||job=="마법사"))return;
		this.job = job;
	}

	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		if(level<1) return;
		this.level = level;
	}

	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		if(money<0) return;
		this.money = money;
	}

	//생성자 2개 - (ooxx),(oooo)
	//=> 생성자 오버로딩(over loading)
	public Game(String id, String job) {
		//두개의 생성자의 코드가 겹치기 때문에
		//아래에 있는 매개변수 4개짜리의 생성자를 부른다.
		this(id,job,1,0);
	}
	
	public Game(String id, String job, int level, int money) {
		this.setId(id);
		this.setJob(job);
		this.setLevel(level);
		this.setMoney(money);
	}
	
	void print() {
		System.out.println("아이디 : "+this.id);
		System.out.println("직업 : "+this.job);
		System.out.println("레벨 : "+this.level);
		System.out.println("소지금 : "+this.money);
		System.out.println("===============");
	}
}
