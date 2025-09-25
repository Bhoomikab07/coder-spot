class Doctor extends Person{

public int doctorAge;
public String doctorName;
public float doctorHeight;
public long doctorNumber;
public double doctorSalary;
public char doctorGender;
public boolean isGovernmentDoctor;


public Doctor(){
System.out.println("this non arguement constructor");
}
public Doctor(int doctorAge,String doctorName,float doctorHeight,long doctorNumber,double doctorSalary,char doctorGender,boolean isGovernmentDoctor)
{
super();
this.doctorAge=doctorAge;
this.doctorName=doctorName;
this.doctorHeight=doctorHeight;
this.doctorNumber=doctorNumber;
this.doctorSalary=doctorSalary;
this.doctorGender=doctorGender;
this.isGovernmentDoctor=isGovernmentDoctor;
}
public  void displayDoctor(){

System.out.println("doctor Age=="+this.doctorAge);
System.out.println("doctor name=="+this.doctorName);
System.out.println("doctor Height=="+this.doctorHeight);
System.out.println("doctor number=="+this.doctorNumber);
System.out.println("doctor salary=="+this.doctorSalary);
System.out.println("doctor gender=="+this.doctorGender);
System.out.println("he is a goverment doctor=="+this.isGovernmentDoctor);
}
}
