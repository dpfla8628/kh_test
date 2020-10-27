package api.collection2;

public class Member {
	
	private String id;
	private String pas;

	public Member(String id, String pas) {
		super();
		this.setId(id);
		this.setPas(pas);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPas() {
		return pas;
	}

	public void setPas(String pas) {
		this.pas = pas;
	}
	

}
