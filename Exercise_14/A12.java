package Exercise_14;

// Object Arrays 
// An array that can hold objects of a class 

class Student
{
	String name;
	
	Student(String name)
	{
		this.name = name;
	}
}

public class A12 {

	public static void main(String[] args) {
		// Declare and initialize an array of student objects 
		Student[] students = new Student[3];
		students[0] = new Student("Alice");
		students[1] = new Student("bob");
		students[2] = new Student("Charlie");
		
		// Accessing object arry elements 
		for(Student student : students)
		{
			System.out.println("Student Name : "+ student.name);
		}

	}

}
