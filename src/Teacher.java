
public class Teacher extends Person {
	public String mHour;

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(String mHour) {
		super();
		this.mHour = mHour;
	}

	@Override
	public void getSalary() {
		// TODO Auto-generated method stub

	}

	@Override
	public void show() {
//		System.out.println("----- INFORMATION OF A Person --------");
//		System.out.println("ID: " + this.mid);
//		System.out.println("NAME: " + this.mName);
//		System.out.println("AGE: " + this.mDateOfBirth);
//		System.out.println("ADDRESS: " + this.mAddress());
//		System.out.println("Salary: " + this.mSalaryFactor);
		System.out.println("Hour: " + this.mHour);
	}

}
