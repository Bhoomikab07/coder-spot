class HospitalRunner{

public static void main(String [] args){

Hospital hospital=new Hospital("Sparsh hospital",36546778l);
Hospital name=new Hospital("Manipal hospital",564647678l);
HeartPatient heartpatient=new HeartPatient("Abhi",'A',name);
CancerPatient cancerpatient=new CancerPatient("Arjun",567558768l,hospital);

heartpatient.DisplayHeartPatientDetails();
cancerpatient.DisplayCancerPatient();
}
}