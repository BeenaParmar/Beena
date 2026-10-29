package q2;

class Emp {

	String name;
	int id;
	double sal;
	String branch;

	public Emp(String name, int id, double sal, String branch) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", branch=" + branch + "]";
	}

}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp("tom", 12, 50000, "Software engineer");
		System.out.println(emp);
	}
}
