package Collections;

public class Studentinfo {
	private String stdname;
	private int age;
	private String clg;
	public Studentinfo() {
		
	}	
	public Studentinfo(String stdname, int age, String clg) {
		super();
		this.stdname = stdname;
		this.age = age;
		this.clg = clg;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public String getClg() {
		return clg;
	}
	public void setClg(String clg) {
		this.clg = clg;
	}
	
	

}
