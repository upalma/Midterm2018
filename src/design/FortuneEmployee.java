package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 * <p>
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 **/
	public static void main(String[] args) {
		EmployeeInfo employee1 = new EmployeeInfo(100);
		EmployeeInfo info1 = new EmployeeInfo("John William", 100);
		EmployeeInfo info2 = new EmployeeInfo(7600.00, 4.20);
		EmployeeInfo info3 = new EmployeeInfo("Developer", "Sr. Developer", "Jewish", "USA");

		EmployeeInfo employee2 = new EmployeeInfo(101);
		EmployeeInfo infor = new EmployeeInfo("Uzzal Palma", 101);
		EmployeeInfo infor1 = new EmployeeInfo(6500.00, 4.30);
		EmployeeInfo infor2 = new EmployeeInfo("IT", "Quality Controller", "Christian", "Bangladesh");

Employee employee = new EmployeeInfo();
		employee.employeeId();
		employee.employeeName();
		employee.assignDepartment();
		employee.calculateSalary();
		employee.benefitLayout();
		employee.jobTitle();
		employee.religion();
		employee.country();
		((EmployeeInfo) employee).employeeJoiningDate();



		System.out.println(employee1+" "+info1+" "+info2+" "+info3);
		System.out.println(employee2+" "+infor+" "+infor1+" "+infor2);

	}

}
