
public class Instructor extends User{
	public Instructor(int id,String firstName,String lastName,String nickName,String adress,String password,String profession) {
		super(id,firstName,lastName,nickName,adress,password);
		this.profession=profession;
	}
	public Instructor() {
		
	}
	
	private String profession;
	

	String getProfession() {
		return profession;
	}

	void setProfession(String profession) {
		this.profession = profession;
	}
	
}
