import java.util.Scanner;

public class Teacher extends Person {
	public static int mHour;

	public int getmHour() {
		return mHour;
	}

	public void setmHour(int mHour) {
		this.mHour = mHour;
	}

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(int mHour) {
		super();
		this.mHour = mHour;
	}

	public void input(Scanner scanner) {
		super.input(scanner);
		System.out.print("Person mHour: ");
		this.mHour = scanner.nextInt();

	}

	@Override
	public int getSalary() {
		return 0;
		// TODO Auto-generated method stub

	}

	@Override
	public void show() {
		System.out.println("Hour: " + this.mHour);
	}

}
