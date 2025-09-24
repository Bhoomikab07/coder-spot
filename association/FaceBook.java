class FaceBook
{
	public String name;
	public User user;
	public FaceBook(User user)
	{
		this.name=user.userName;
		this.user=user;
	}
}