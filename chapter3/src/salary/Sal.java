package salary;

import com.hospital.staff.doctor.salary.Salary;

public class Sal extends Salary {

	@Override
	protected void calculateSalary(double amt, double tax) {
		System.out.println(amt - tax);
	}

}

class Staff extends com.hospital.staff.doctor.salary.Salary {
	@Override
	protected void calculateSalary(double amt, double tax) {
		System.out.println(amt - tax);
	}
}

class Main {
	public static void main(String[] args) {
		Sal sal = new Sal();
		sal.calculateSalary(35000, 350);

		Staff staff = new Staff();
		staff.calculateSalary(25000, 250);
	}
}