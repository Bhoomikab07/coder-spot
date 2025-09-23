class UniversityRunner
{
	public static void main(String [] ref)
	{
		University university = new University();
		College collegeName = new College("Akash",'A');
		College name = new College("AMC",'A');
		College value = new College("PES",'P');
		College total = new College("CMR",'C');
		College[] college = {collegeName,name,value,total};
		university.universityDetails(college);
	}
}