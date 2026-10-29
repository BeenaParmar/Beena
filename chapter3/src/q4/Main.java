package q4;

class Emp {

	private String name;
	private double sal;
	private int id;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getSal() {
		return sal;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

}

public class Main {

	public static void main(String[] args) {

		Emp emp = new Emp();
		emp.setId(12);
		emp.setName("tom");
		emp.setSal(25000);

		System.out.println(emp.getId());

	}

}
