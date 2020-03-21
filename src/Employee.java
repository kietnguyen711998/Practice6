public class Employee extends Person {
	public static int mSalaryFactor;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getSalary() {
		return this.mSalaryFactor = mSalaryFactor;
	}

	@Override
	public void show() {
		System.out.println("----- INFORMATION OF A Person --------");
		System.out.println("ID: " + this.mid);
		System.out.println("NAME: " + this.mName);
		System.out.println("AGE: " + this.mDateOfBirth);
		System.out.println("ADDRESS: " + this.getmAddress());
		System.out.println("Salary: " + this.mSalaryFactor);
		System.out.println("Hour: " + Teacher.mHour);

	}

}
