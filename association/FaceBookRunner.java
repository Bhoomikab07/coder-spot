class FaceBookRunner
{
	public static void main(String [] ref)
	{
		User user = new User("Bhoomika");
		FaceBook facebook = new FaceBook(user);
		System.out.println(facebook.name);
	}
}