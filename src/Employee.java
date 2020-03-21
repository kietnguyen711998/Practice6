
public class Employee extends Person {
	public String mSalaryFactor;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String mSalaryFactor) {
		super();
		this.mSalaryFactor = mSalaryFactor;
	}

	@Override
	public void getSalary() {
		this.mSalaryFactor = mSalaryFactor;

	}

	@Override
	public void show() {
		System.out.println("----- INFORMATION OF A Person --------");
		System.out.println("ID: " + this.mid);
		System.out.println("NAME: " + this.mName);
		System.out.println("AGE: " + this.mDateOfBirth);
		System.out.println("ADDRESS: " + this.getmAddress());
		System.out.println("Salary: " + this.mSalaryFactor);

	}

}
