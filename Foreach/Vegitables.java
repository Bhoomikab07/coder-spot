class Vegitables
{
	public String vegitableName;
	public boolean isFresh;
	
	public Vegitables(String name,boolean fresh)
	{
		vegitableName=name;
		isFresh=fresh;
	}
	public void vegitableDetails()
	{
		System.out.println("vegitable name :"+vegitableName+","+"fresh :"+isFresh);
	}
}