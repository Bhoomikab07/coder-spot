class University
{
	public void universityDetails(College[] college)
	{
		for(College nameOfCollege : college)
		{
			nameOfCollege.collegeDetails();
		}
	}
}