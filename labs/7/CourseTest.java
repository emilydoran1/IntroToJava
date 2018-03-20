
public class CourseTest {

	public static void main(String[] args) {
		//create a course
		Course cmpt220 = new Course("cmpt220");
		
		//add three students
		cmpt220.addStudent("Sarah");
		cmpt220.addStudent("Matt");
		cmpt220.addStudent("Mark");
		
		//remove one student
		cmpt220.dropStudent("Matt");
		
		//display the students in the course
		System.out.print("The students in the course " + cmpt220.getCourseName() + " are: " );
		String[] students = cmpt220.getStudents();
		for(int i = 0; i < cmpt220.getNumberOfStudents(); i++) 
			System.out.print(students[i] + " ");
	}

}
