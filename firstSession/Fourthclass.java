package firstSession;

public class Fourthclass {

	private String ename;
	private String designation;
	private String email;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	private String toString() {
//		return Fourthclass (ename=" + ename + ", designation=" + designation + ", email=" + email + ");
//	}
	@Override
    public String toString() {
        return "Fourthclass [ename=" + ename + ", designation=" + designation + ", email=" + email + "]";
    }
}