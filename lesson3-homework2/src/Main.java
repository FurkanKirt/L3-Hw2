
public class Main {

	public static void main(String[] args) {
		Student student1=new Student();
		student1.name="Furkan";
		student1.lastname="Kirt";
		student1.id="asd";
		student1.email="fk@gmail.com";
		student1.interest="java";
		student1.studentnumber=5555;
		
		Instructor instructor=new Instructor();
		instructor.coursename="java";
		instructor.email="ed@gmail.com";
		instructor.name="engin";
		instructor.lastname="demiroğ";
		instructor.profession="codding";
		
		
		StudentManager studentManager=new StudentManager();
		studentManager.add(student1);
		studentManager.delete(student1);
		studentManager.update(student1);		
		studentManager.register(student1);
		System.out.println("-------------");
		
		InstructerManager instructerManager=new InstructerManager();
		instructerManager.add(instructor);
		instructerManager.delete(instructor);
		instructerManager.update(instructor);
		instructerManager.addCourse(instructor);
		instructerManager.deleteCourse(instructor);
		System.out.println("-------------");
		
		
	}

}
