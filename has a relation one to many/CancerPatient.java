class CancerPatient{

public String patientName;
public long patientNumber;
public Hospital hospital;

public CancerPatient(String patientName,long patientNumber,Hospital hospital){

this.patientName=patientName;
this.patientNumber=patientNumber;
this.hospital=hospital;
}
public void DisplayCancerPatient(){

System.out.println("patient Name="+patientName+","+"patient Number="+patientNumber);
System.out.println("hospital name="+hospital.hospitalName+","+"hospital number="+hospital.hospitalNumber);
}
}