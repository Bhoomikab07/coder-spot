class Employee
{
	public String employeeName;
	public char employeeCode;
	
	public Employee(String name,char code)
	{
		employeeName=name;
		employeeCode=code;
	}
	public void employeeDetails()
	{
		System.out.println("employee name :"+employeeName+","+" employeecode :"+employeeCode);
	}
}