package g30126.bacs.andrei.l4.e4;

public class Author {
	private String name, email;
	private char gender;
	public Author(String name,String email,char gender) {
		this.email=email;
		this.name=name;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public char getGender() {
		return gender;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String toString(){
		return name+"("+gender+")"+" at "+email;
	}
	

}
