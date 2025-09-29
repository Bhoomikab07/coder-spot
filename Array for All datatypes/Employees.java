class Employees{
	
	public static void main(String [] args){
	
	String firstEmployee="Bhoomi";
	String secondEmployee="Mandara";
	String thirdEmployee="Chandu";
	String fourthEmployee="Chandana";
	
	System.out.println("Employee list of Names");
	System.out.println("---------------------------");
	
	String [] EmployeeNames={firstEmployee, secondEmployee, thirdEmployee, fourthEmployee};
	
	for(int names=0; names<EmployeeNames.length; names++){
		System.out.println(EmployeeNames[names]);
	}
  
  
  int BhoomiId=101;
  int MandaraId=101;
  int ChanduId=101;
  int ChandanaId=101;
  
  System.out.println("Employee list of ID");
	System.out.println("---------------------------");
  
  int [] EmployeesId={BhoomiId, MandaraId, ChanduId, ChandanaId};
  
    for(int id=0; id<EmployeesId.length; id++){
	   System.out.println(EmployeesId[id]);
    }
	
	
	long BhoomiNumber=6360211265l;
	long MandaraNumber=8760211265l;
	long ChanduNumber=7860211265l;
	long ChandanaNumber=9960211265l;
	
	System.out.println("Employee list of Number");
	System.out.println("---------------------------");
	
	long [] EmployeesNumber={BhoomiNumber, MandaraNumber, ChanduNumber,ChandanaNumber};
	
	for(int number=0; number<EmployeesNumber.length; number++){
		System.out.println(EmployeesNumber[number]);
	}
	
	float BhoomiHeight=5.1f;
	float MandaraHeight=4.9f;
	float ChanduHeight=5.8f;
	float ChandanaHeight=5.5f;
	
	System.out.println("Employee list of Height");
	System.out.println("---------------------------");
	
	float [] EmployeesHeight={BhoomiHeight, MandaraHeight, ChanduHeight, ChandanaHeight};
	
	for(int height=0; height<EmployeesHeight.length; height++){
		System.out.println(EmployeesHeight[height]);
	}
	
	double BhoomiExpenditure=2000.99d;
	double MandaraExpenditure=3000.99d;
	double ChanduExpenditure=1000.88d;
	double ChandanaExpenditure=2500.99d;
	
	System.out.println("Employee list of Expendeture");
	System.out.println("---------------------------");
	
	double [] EmployeesExpenditure={BhoomiExpenditure, MandaraExpenditure,ChanduExpenditure,  ChandanaExpenditure};
	
	for(int Expenditure=0; Expenditure<EmployeesExpenditure.length; Expenditure++){
		System.out.println(EmployeesExpenditure[Expenditure]);
	}
	
	char BhoomiGrade='A';
	char MandaraGrade='B';
	char ChanduGrade='C';
	char ChandanaGrade='A';
	
	System.out.println("Employee list of Grade");
	System.out.println("---------------------------");
	
	char [] EmployeesGrade={BhoomiGrade, MandaraGrade, ChanduGrade, ChandanaGrade};
	
	for(int grade=0; grade<EmployeesGrade.length; grade++){
		System.out.println(EmployeesGrade[grade]);
	}
	
	boolean BhoomiIsEmployee=true;
	boolean MandaraIsEmployee=true;
	boolean ChanduIsEmployee=true;
	boolean ChandanaIsEmployee=true;
	
	System.out.println("Employee list");
	System.out.println("---------------------------");
	
	boolean [] isEmployee={BhoomiIsEmployee, MandaraIsEmployee, ChanduIsEmployee, ChandanaIsEmployee};
	
	for(int isShe=0; isShe<isEmployee.length; isShe++){
		System.out.println(isEmployee[isShe]);
	}
	}
}
 
	
