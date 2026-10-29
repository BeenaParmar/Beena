package practice;

import java.util.Objects;

class Emp implements Cloneable{
	String name;
	int id;
	
	public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}
	
	@Override
	protected void finalize() throws Throwable {
System.out.println("deleted..");
		super.finalize();
		
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Emp emp = new Emp("Tom", 12);
//		System.out.println();
		
		emp = null;
		System.gc();
		
		Emp emp1 = new Emp("Tom", 12);
		Emp emp2 = new Emp("Tom", 12);
		System.out.println(emp1.equals(emp2));

		System.out.println(emp1);
		System.out.println(emp2);
		
		Emp empclone = (Emp) emp1.clone();
		System.out.println(empclone);
	}
}
