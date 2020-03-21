import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MangagerFunction {
	public static List<Person> listEmployee = new ArrayList<>();

	public MangagerFunction() {
		// TODO Auto-generated constructor stub
	}

	public void add(Scanner sc) {
		Person person = new Person() {

			@Override
			public void show() {
				// TODO Auto-generated method stub

			}

			@Override
			public void getSalary() {
				// TODO Auto-generated method stub

			}
		};
		person.input(sc);
		listEmployee.add(person);
	}

	public void showListPerson() {
		for (int i = 0; i < listEmployee.size(); i++) {
			System.out.println("=== Information Person " + (i + 1) + " ===");
			listEmployee.get(i).show();
		}
	}

}
