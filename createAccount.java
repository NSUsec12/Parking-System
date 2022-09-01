package Car_Park;

public class createAccount {
	String name;
	String gender;
	String pass;
	String mail;
	String birth;
	protected String n;
	protected String p;
	protected String g;
	protected String e;
	protected String m;
	public createAccount(String name,String gender, String pass, String mail, String birth) {
		this.gender= gender;
		this.name = name;
		this.pass = pass;
		this.mail = mail;
		this.birth = birth;
	}
	
	public String toString() {
		return  name + "," + gender+ ","+ pass +","+ mail + ","+ birth;
	}
	
	

}
