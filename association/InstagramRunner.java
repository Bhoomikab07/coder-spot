class InstagramRunner
{
	public static void main(String [] ref)
	{
		User user = new User("Bhoomika");
		Instagram instagram = new Instagram(user);
		System.out.println(instagram.name);
	}
}