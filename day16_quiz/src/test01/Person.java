package test01;

public class Person {
	private String name;
	private char gender;
	
	public Person() {
	}
	
	public Person(String name, char gender) {
		this.setName(name);
		this.setGender(gender);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
