package q1;

class Student {

	String name = "beena";
	int rollno = 12;

	static double fees = 36000;
	static int marks = 100;

	void showInfo() {
		System.out.println(name);
		System.out.println(rollno);
	}

	static void displayInfo() {

		System.out.println(fees);
		System.out.println(marks);
	}
}

public class Main {
	public static void main(String[] args) {

		Student student = new Student();
		System.out.println(student.name);
		System.out.println(student.rollno);
		System.out.println(Student.fees);
		System.out.println(Student.marks);
		
//		student.showInfo();
//		Student.displayInfo();
	}
}
