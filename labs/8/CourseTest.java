
public class CourseTest {

	public static void main(String[] args) {
		//create courses
		Course c1 = new Course("cmpt220");
		Course c2 = new Course("math205");
		
		//add students to each course
		c1.addStudent("Mary");
		c1.addStudent("Jack");
		
		c2.addStudent("Nick");
		c2.addStudent("Susan");
		
		//print out number of students in each class 
		System.out.println("Number of students in c1: "
				+ c1.getNumberOfStudents());
		System.out.print("Number of students in course2: "
				+ c2.getNumberOfStudents());
		
		System.out.println();
		
		//print out students in each class
		String[] c1Students = c1.getStudents();
		System.out.print(c1.getCourseName() + ": ");
		for (int i = 0; i < c1.getNumberOfStudents(); i++)
			System.out.print(c1Students[i] + ", ");
		System.out.println();
		
		String[] c2Students = c2.getStudents();
		System.out.print(c2.getCourseName() + ": ");
		for (int i = 0; i < c2.getNumberOfStudents(); i++)
			System.out.print(c2Students[i] + ", ");
		System.out.println();
	}

}
