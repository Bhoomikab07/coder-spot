class Students{
	
	public static void main(String [] args){
	
	String firstStudent="Bhoomi";
	String secondStudent="Mandara";
	String thirdStudent="Chandu";
	String fourthStudent="Chandana";
	
	System.out.println("Student list of Names");
	System.out.println("---------------------------");
	
	String [] studentNames={firstStudent, secondStudent, thirdStudent, fourthStudent};
	
	for(int names=0; names<studentNames.length; names++){
		System.out.println(studentNames[names]);
	}
  
  
  int BhoomiId=101;
  int MandaraId=101;
  int ChanduId=101;
  int ChandanaId=101;
  
  System.out.println("Student list of ID");
	System.out.println("---------------------------");
  
  int [] studentsId={BhoomiId, MandaraId, ChanduId, ChandanaId};
  
    for(int id=0; id<studentsId.length; id++){
	   System.out.println(studentsId[id]);
    }
	
	
	long BhoomiNumber=545566666l;
	long MandaraNumber=8760211265l;
	long ChanduNumber=7860211265l;
	long ChandanaNumber=9960211265l;
	
	System.out.println("Student list of Number");
	System.out.println("---------------------------");
	
	long [] studentsNumber={BhoomiNumber, MandaraNumber, ChanduNumber,ChandanaNumber};
	
	for(int number=0; number<studentsNumber.length; number++){
		System.out.println(studentsNumber[number]);
	}
	
	float BhoomiHeight=5.1f;
	float MandaraHeight=5.9f;
	float ChanduHeight=5.8f;
	float ChandanaHeight=5.5f;
	
	System.out.println("Student list of Height");
	System.out.println("---------------------------");
	
	float [] studentsHeight={BhoomiHeight, MandaraHeight, ChanduHeight, ChandanaHeight};
	
	for(int height=0; height<studentsHeight.length; height++){
		System.out.println(studentsHeight[height]);
	}
	
	double BhoomiExpenditure=2000.99d;
	double MandaraExpenditure=3000.99d;
	double ChanduExpenditure=1000.88d;
	double ChandanaExpenditure=2500.99d;
	
	System.out.println("Student list of Expendeture");
	System.out.println("---------------------------");
	
	double [] studentsExpenditure={BhoomiExpenditure, MandaraExpenditure,ChanduExpenditure,  ChandanaExpenditure};
	
	for(int Expenditure=0; Expenditure<studentsExpenditure.length; Expenditure++){
		System.out.println(studentsExpenditure[Expenditure]);
	}
	
	char BhoomiGrade='A';
	char MandaraGrade='B';
	char ChanduGrade='C';
	char ChandanaGrade='A';
	
	System.out.println("Student list of Grade");
	System.out.println("---------------------------");
	
	char [] studentsGrade={BhoomiGrade, MandaraGrade, ChanduGrade, ChandanaGrade};
	
	for(int grade=0; grade<studentsGrade.length; grade++){
		System.out.println(studentsGrade[grade]);
	}
	
	boolean BhoomiIsStudent=true;
	boolean MandaraIsStudent=true;
	boolean ChanduIsStudent=true;
	boolean ChandanaIsStudent=true;
	
	System.out.println("Student list");
	System.out.println("---------------------------");
	
	boolean [] isStudent={BhoomiIsStudent, MandaraIsStudent, ChanduIsStudent, ChandanaIsStudent};
	
	for(int isShe=0; isShe<isStudent.length; isShe++){
		System.out.println(isStudent[isShe]);
	}
	
 }
	
}