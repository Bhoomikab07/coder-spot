class HeartPatient{

public String patientName;
public char patientCode;
public Hospital hospital;

public HeartPatient(String patientName,char patientCode,Hospital hospital){

this.patientName=patientName;
this.patientCode=patientCode;
this.hospital=hospital;
}
public void DisplayHeartPatientDetails(){

System.out.println("patient name="+patientName+","+"patient code="+patientCode);
System.out.println("hospital name="+hospital.hospitalName+","+"hospital number="+hospital.hospitalNumber);
}
}