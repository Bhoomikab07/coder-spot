class Bank{

public String bankNames;
public int noOfAccount;
public Branch branch;
public Location location;
public BankName bankName;

public Bank(String bankNames,int noOfAccount,Branch branch,Location location,BankName bankName){

this.bankNames=bankNames;
this.noOfAccount=noOfAccount;
this.branch=branch;
this.location=location;
this.bankName=bankName;

}
public void displayBankDetails(){

System.out.println("name of the bank="+bankName+","+"number  of accounts="+noOfAccount);
System.out.println("branch name="+branch.branchName+","+"branch code="+branch.branchCode);
System.out.println("location name="+location.locationName+","+"location number="+location.locationNumber);
System.out.println("number of accounts="+bankName.noOfAccount+","+"total amount="+bankName.totalAmount);
}
}