import java.util.ArrayList;

public class Course {
	private String courseName;
	private ArrayList<String> students;
	
	/**constructor for the Course class*/
	public Course(String courseName) {
		this.courseName = courseName;
		students = new ArrayList<String>();
	}
	
	/**method adds the student to the course*/
	public void addStudent(String student) {
		students.add(student);
	}
	
	/**method returns all of the students in the course*/
	public String[] getStudents() {
		String[] myArray = new String[students.size()];
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = students.get(i);
		}
		return myArray;
	}
	
	/**method returns the number of students in the course*/
	public int getNumberOfStudents() {
		return students.size();
	}
	
	/**method returns the name of the course*/
	public String getCourseName() {
		return courseName;
	}
	
	/**method to drop a student from the course*/
	public void dropStudent(String student) {
		students.remove(student);
	}
}
