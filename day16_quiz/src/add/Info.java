package add;

public class Info {
	private String name;
	private int java_score;
	private int jsp_score;
	
	public Info(String name, int java_score, int jsp_score) {
		this.setJava_score(java_score);
		this.setJsp_score(jsp_score);
		this.setName(name);
	}
	public Info() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJava_score() {
		return java_score;
	}

	public void setJava_score(int java_score) {
		this.java_score = java_score;
	}

	public int getJsp_score() {
		return jsp_score;
	}

	public void setJsp_score(int jsp_score) {
		this.jsp_score = jsp_score;
	}

}
