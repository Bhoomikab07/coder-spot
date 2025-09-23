class ZooRunner
{
public static void main(String [] args)
{

Zoo zoo =new Zoo();
Animals animalsName=new Animals("Lion",1);
Animals name=new Animals("Tiger",2);
Animals names=new Animals("Giraffe",3);
Animals total=new Animals("Bear",4);
Animals [] animals={animalsName,name,names,total};
zoo.zooDetails(animals);
}
}