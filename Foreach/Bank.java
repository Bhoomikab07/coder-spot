class Bank
{
	public void bankDetails(Employee[] employee)
	{
		for(Employee nameOfEmployee : employee)
		{
			nameOfEmployee.employeeDetails();
		}
	}
}