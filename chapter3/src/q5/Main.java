package q5;

class Emp{
	String name;
	int id;
	
	
	static double sal = 25000;
	static String branch = "SE";
	
	 void showInfo(double bonus) {
		 System.out.println(bonus);
		 System.out.println(name);
		 System.out.println(id);
	}
	
	 
	 public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	 @Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}

	 static void displayInfo() {
System.out.println(sal);
System.out.println(branch);
	}
}
public class Main {
public static void main(String[] args) {
	Emp emp = new Emp("Beena", 12);
	emp.showInfo(120);
	Emp.displayInfo();
	
}
}
