class EBook extends Book{

public static void displayEBookDetails()
{

    //displayBook();
     bookName="Java";
     //price=200;
     System.out.println(bookName);
     //System.out.println(price);
 }
 public void displayEBook()
 {
     bookName="Core Java";
     price=300;
     System.out.println(bookName);
     System.out.println(price);
     displayBook();
 }
 }