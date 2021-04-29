
public class InstructerManager extends UserManager{
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.coursename+" Kursunuz eklenmiþtir!");
	}
	public void deleteCourse(Instructor instructor) {
		System.out.println(instructor.coursename+" Kursunuz silinmiþtir!");
	}
	
}
