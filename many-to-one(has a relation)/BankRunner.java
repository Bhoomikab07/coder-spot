class BankRunner{
public static void main(String [] args){

Branch branch=new Branch("bengalore",'B');
Location location=new Location("vijaynagar",5464676l);
BankName bankName=new BankName(4554,5676.899);
Bank bank=new Bank("Canara Bank",44554,branch,location,bankName);
bank.displayBankDetails();
}}