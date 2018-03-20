
public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		//increase size of array if there is no room for more students
		if(students.length == numberOfStudents) {
			String[] myArray = new String[numberOfStudents + 1];
			for(int i = 0; i < numberOfStudents; i++) {
				myArray[i] = students[i];
			}
			//set students equal to the new array
			students = myArray;
		}
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public String[] getStudents() {
		//create a new array
		String[] myArray = new String[numberOfStudents];
		
		//copy students to array
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = students[i];
		}
		return myArray;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
		//create a new array to hold values
		String[] myArray = new String[students.length - 1];
		
		//search for array to find student and remove them
		for(int i = 0, j = 0; i < myArray.length; i++, j++) {
			if(students[i] == student) {
				j++;
			}
			myArray[i] = students[j];
		}
		//set students equal to myArray
		students = myArray;
		numberOfStudents--;
	}
	
	public void clear() {
		numberOfStudents = 0;
		students = new String[numberOfStudents];
	}
	
}
