import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MangagerFunction {
	public static List<Person> listEmployee = new ArrayList<>();
	Person employee = new Employee();

	public MangagerFunction() {
		// TODO Auto-generated constructor stub
	}

	public static void initMenu(Scanner sc) {
		System.out.println("OPTIONAL");
		System.out.println("\t\t=== Manager Person ===");
		System.out.println("1.Input employee or teacher ");
		System.out.println("2.Show payroll list. ");
		System.out.println("3.Show person has highest salary");
		System.out.println("4.Show total salary must paid");
		System.out.println("5.Exit");
	}

	public static void add(Scanner sc) {
		Person person = new Employee();
		person.input(sc);
		listEmployee.add(person);
	}

	public static void showListPerson() {
		for (int i = 0; i < listEmployee.size(); i++) {
			System.out.println("=== Information Person " + (i + 1) + " ===");
			listEmployee.get(i).show();
		}
	}

	Person employee1 = null;

	public static void highestSalary() {
		Employee newEmployee = new Employee();
		newEmployee = null;
		for (Person person1 : listEmployee) {
			if (newEmployee == null) {
				newEmployee = (Employee) person1;
			} else {
//				if (person1.getSalary() > employee1.getSalary()) {
//					newEmployee = (Employee) person1;
//				}
				System.out.println(person1.getSalary());

			}
			// newEmployee.show();
		}
	}

	public static void totaltSalary() {
		int total = 0;
		for (Person person1 : listEmployee) {
			total += person1.getSalary();
		}

		System.out.println(" Total salary must paid" + total);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// initialization object
		int option;
		do {
			initMenu(sc);
			option = sc.nextInt();
			// switch case ste
			switch (option) {
			case 1:
				add(sc);
				break;
			case 2:
				showListPerson();
				break;
			case 3:
				highestSalary();
				break;
			case 4:
				totaltSalary();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				initMenu(sc);
				break;
			}
		} while (option != 5);

	}

}
