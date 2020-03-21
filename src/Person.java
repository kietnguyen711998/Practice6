import java.util.Scanner;

public abstract class Person {
	public String mid;
	public String mName;
	public String mDateOfBirth;
	public String mAddress;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String mid, String mName, String mDateOfBirth, String mAddress) {
		super();
		this.mid = mid;
		this.mName = mName;
		this.mDateOfBirth = mDateOfBirth;
		this.mAddress = mAddress;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmDateOfBirth() {
		return mDateOfBirth;
	}

	public void setmDateOfBirth(String mDateOfBirth) {
		this.mDateOfBirth = mDateOfBirth;
	}

	public String getmAddress() {
		return mAddress;
	}

	public void setmAddress(String mAddress) {
		this.mAddress = mAddress;
	}

	public void input(Scanner scanner) {
		System.out.print("Person id: ");
		this.mid = scanner.next();

		System.out.print("Person name: ");
		this.mName = scanner.next();

		System.out.print("Person DateOfBirth: ");
		this.mDateOfBirth = scanner.next();

		System.out.print("Person address: ");
		this.mAddress = scanner.next();

		System.out.print("Person SalaryFactor: ");
		Employee.mSalaryFactor = scanner.nextInt();

		System.out.print("Person Hour: ");
		Teacher.mHour = scanner.nextInt();
	}

	public abstract int getSalary();

	public abstract void show();

}
