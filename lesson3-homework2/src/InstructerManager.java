
public class InstructerManager extends UserManager{
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.coursename+" Kursunuz eklenmiştir!");
	}
	public void deleteCourse(Instructor instructor) {
		System.out.println(instructor.coursename+" Kursunuz silinmiştir!");
	}
	
}
