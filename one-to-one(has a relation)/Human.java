class Human{

public String humanName;
public int humanAge;
public Heart heart;

public Human(String humanName,int humanAge,Heart heart){

this.humanName=humanName;
this.humanAge=humanAge;
this.heart=heart;

}
public void displayHuman(){

System.out.println("human name="+humanName+","+"human age="+humanAge);
System.out.println("heart beat="+heart.heartBeat+","+"blood group="+heart.bloodGroup);
}
}