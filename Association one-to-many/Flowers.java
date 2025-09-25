class Flowers{

public String name;
public boolean isFresh;
public Vegitables vegitables;

public Flowers(String name,boolean isFresh,Vegitables vegitables){

this.name=name;
this.isFresh=isFresh;
this.vegitables=vegitables;
}
public void displayFlowers(){

System.out.println("flowers name="+name+","+"is fresh="+isFresh);
System.out.println("vegitables name="+vegitables.name+","+"vegitables price="+vegitables.price);
}
}