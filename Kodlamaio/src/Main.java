
public class Main {

	public static void main(String[] args) {
		Student student1= new Student();
		student1.setId(0);
		student1.setFirstname("Murat");
		student1.setLastname("Ceniklioğlu");
		System.out.println(student1.getId());
		StudentManager studentManager=new StudentManager();
		studentManager.add(student1);
		Instructor instructor=new Instructor(1,"Murat","Ceniklioğlu","Muratcnkli","Sultanbeyli","123456","Java Teacher") ;
		instructor.setFirstname("Engin");
		instructor.setLastname("Demiroğ");
		InstructorManager	instructorManager=new InstructorManager();
		instructorManager.add(instructor);
		Student student2=new Student();
		student2.setFirstname("Mrat");
		student2.setLastname("Celioğlu");
		studentManager.add(student2);

	}

}
