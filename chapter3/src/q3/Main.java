package q3;

class Acc {

	void calSal(double sal) {
		System.out.println(sal);

	}

	void calsal(double sal, double bonus) {
		System.out.println(sal + bonus);
	}

}

class Emp extends Acc {
	@Override
	void calSal(double sal) {
		super.calSal(sal);
	}

}

public class Main {

	public static void main(String[] args) {

		Acc acc = new Acc();
		acc.calSal(35000);
		acc.calsal(25000, 10000);

		Emp emp = new Emp();
		emp.calSal(35000);
	}
}
