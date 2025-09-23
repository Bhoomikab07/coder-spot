class BankRunner
{
	public static void main(String [] ref)
	{
		Bank bank = new Bank();
		Employee employeeName = new Employee("Ram",'R');
		Employee name = new Employee("Raj",'R');
		Employee value = new Employee("Anju",'A');
		Employee total = new Employee("Arya",'a');
		Employee[] employee = {employeeName,name,value,total};
		bank.bankDetails(employee);
	}
}