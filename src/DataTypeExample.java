

public class DataTypeExample {

	public static void main(String[] args) {
		//Primitive types(directly strored in stack)
		int employeeCount = 120;
		double avgSalary = 75000.50;
		boolean isActive = true;
				
				//Reference types(heap memory)
				
	String department = "Engineering";
		int[] projectIds = {101,102,103};
		
		System.out.println("Employee Count: "+employeeCount);
		System.out.println("Average Salary: "+avgSalary);
		System.out.println("Active department: "+department);
		System.out.println("First Project Id: "+projectIds[0]);
		

	}

}
