
public class User {
	public User() {
		
	}
	public User(int id,String firstName,String lastName,String nickName,String adress,String password) {
		
	}
	
	private int id;
	private String firstName;
	private String lastName;
	private String nickName;
	private String adress;
	private String password;

	
	
	String getPassword() {
		return password;
	}
	String getAdress() {
		return adress;
	}
	void setAdress(String adress) {
		this.adress = adress;
	}
	String getNickname() {
		return nickName;
	}
	void setNickname(String nickname) {
		this.nickName = nickname;
	}
	String getLastname() {
		return lastName;
	}
	void setLastname(String lastname) {
		this.lastName = lastname;
	}
	String getFirstname() {
		return firstName;
	}
	void setFirstname(String firstname) {
		this.firstName = firstname;
	}
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	
}

