
public class Student extends User {
	public Student(int id,String firstName,String lastName,String nickName,String adress,String password, String studentNo) {
		super(id,firstName,lastName,nickName,adress,password);
		this.studentNo=studentNo;
	}
	public Student() {
		
	}
	
	private String studentNo;

	String getStudentNo() {
		return studentNo;
	}

	void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	
}
