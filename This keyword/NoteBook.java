class NoteBook{
public NoteBook()
{
this(50);
}
public NoteBook(int price)
{
this(100,"Classmate");
System.out.println("the NoteBook constructor with price="+price);
}
public NoteBook(int price,String noteBookName)
{
this(100,"Classmate",true);
System.out.println("in NoteBook class:"+price);
System.out.println("in NoteBook class:"+noteBookName);
}
public NoteBook(int price,String noteBookName,boolean isGood )
{
System.out.println("the NoteBook is good");
}
}