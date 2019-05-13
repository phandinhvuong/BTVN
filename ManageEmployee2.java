package lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageEmployee2 implements ManageEmployee1 {
	public static Scanner scanner = new Scanner(System.in);
	public static Scanner scanner1 = new Scanner(System.in);
	//public static Employee[]  employees;
	ArrayList<Employee> list = new ArrayList<>();
	
	
	public static void main(String[] args) {
		showMenu();
		System.out.println("Exit");
	}
	public static void showMenu() {
		ManageEmployee1 employee21 = new ManageEmployee2();
		
		int so;
		do {
			System.out.println("-----MENU-----");
			System.out.println("1. Create Employee");
			System.out.println("2. Show The Existing Employee");
			System.out.println("3. Exit");
			System.out.println("4. Search Employee ");
			System.out.println("5. Update ");
			System.out.println("0. Return Menu");

		System.out.println("---> Moi chon cong viec ");
		so = scanner.nextInt();
		System.out.println("Cong viec da chon:  "+ so);
		switch(so) {
		case 0:
			showMenu();
			break;
		case 1:
			employee21.addEmployee();
			break;
		case 2:
			employee21.showEmployy();
			break;
		case 3:
			break;
		case 4:
			System.out.println("Input name to search: ");
			String nameInput = scanner1.nextLine();
			Employee employee = employee21.searchByName(nameInput);
			System.out.println("Thong tin tim kiem");
			System.out.println(employee.id + " " + employee.name + " " + employee.salary);
			break;
		case 5:
			System.out.println("Input name to search: ");
			String nameInputUpdate = scanner1.nextLine();
			System.out.println("New Salary: ");
			double NewSalary = scanner.nextDouble();
			employee21.updateEmployeeByName(nameInputUpdate, NewSalary);
			break;
		default:
			System.out.println("Nhap sai. Moi nhap lai");
			break;
		}
		}while( so != 5);
	}

	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Nhap so nhan vien can them: ");
		int employeeNo= scanner.nextInt();
		for ( int i = 0 ; i< employeeNo ; i++) {
			System.out.println("Moi nhap ten: ");
			String name = scanner1.nextLine();
			System.out.println("Moi nhap muc luong: ");
			double salary = scanner.nextDouble();
			System.out.println("Moi nhap tuoi: ");
			int age = scanner.nextInt();
			System.out.println("Moi nhap cong viec: ");
			String jobName = scanner1.nextLine();
			System.out.println("Da ket hon chua: ");
			boolean married = scanner.nextBoolean();
			Employee employee = new Employee(name,i+1,salary,age,married,new Job(i+1,jobName));
			list.add(employee);
		}
	}

	@Override
	public void showEmployy() {
		// TODO Auto-generated method stub
		System.out.println("ID	Name		Salary		Job name");
		for(Employee employee:list) {
			System.out.println(employee.getId() +"	"+ employee.getName()  +"	"+ employee.getSalary()+"		"+ employee.getJob().name);
		}
	}

	@Override
	public Employee searchByName(String nameInput) {
		// TODO Auto-generated method stub
		Employee employee = null;
		for(int i = 0; i<list.size(); i++) {
			if( nameInput.equals(list.get(i).getName()) ) {
				employee = list.get(i);	
				break;
			}else 
				System.out.println("Khong tim thay ten");
		}
		return employee;
	}

	@Override
	public void updateEmployeeByName(String nameInput, Double newSalary) {
		// TODO Auto-generated method stub
		for(int i = 0; i<list.size(); i++) {
			if( nameInput.equals(list.get(i).getName()) ) {
				list.get(i).setSalary(newSalary);
				break;
			}	
	}
	
	}
}
