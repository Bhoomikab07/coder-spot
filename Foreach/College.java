class College
{
	public String collegeName;
	public char collegeCode;
	
	public College(String name,char code)
	{
		collegeName=name;
		collegeCode=code;
	}
	public void collegeDetails()
	{
		System.out.println("college name :"+collegeName+","+" collegecode :"+collegeCode);
	}
}