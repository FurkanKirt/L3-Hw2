
public class InstructerManager extends UserManager{
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.coursename+" Kursunuz eklenmi�tir!");
	}
	public void deleteCourse(Instructor instructor) {
		System.out.println(instructor.coursename+" Kursunuz silinmi�tir!");
	}
	
}
